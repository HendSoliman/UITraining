package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.trainingwarehouse.ui.client.command.ETrainUserCommandFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.dematic.wms.app.base.ui.client.frame.AppContext;
import com.dematic.wms.app.base.ui.client.scomponent.MainDialog;
import com.dematic.wms.app.base.ui.client.scomponent.datagrid.DtoAdministrationGrid;
import com.dematic.wms.app.base.ui.client.scomponent.datagrid.QueryServiceGrid;
import com.dematic.wms.app.base.ui.shared.data.DtoProperty;
import com.dematic.wms.app.base.ui.shared.sp.ServerPushEvent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

import de.novanic.eventservice.client.event.Event;
import de.novanic.eventservice.client.event.listener.RemoteEventListener;

@MainDialog
public class ETrainGroupDialog extends com.dematic.wms.app.base.ui.client.scomponent.SMainDialog {
  
   private RemoteEventListener allPermissionsDeletedListener;

   //Define a public member we have just defined in the UI Binder file.   
   @UiField(provided = true)
   public QueryServiceGrid groupGrid;

   @UiField(provided = true)
   public DtoAdministrationGrid permissionGrid;

   @UiField(provided = true)
   public DtoAdministrationGrid usersGrid;

   private static ETrainGroupDialogUiBinder uiBinder = GWT.create(ETrainGroupDialogUiBinder.class);

   interface ETrainGroupDialogUiBinder extends UiBinder<Widget, ETrainGroupDialog> {
   }

   // should return the widget for the XML file we have created
   @Override
   protected Widget createUiBinderWidget() {
      return uiBinder.createAndBindUi(this);
   }

   @Override
   protected void initGrids()
   {

      groupGrid = new ETrainGroupGrid();
      permissionGrid = new ETrainPermissionGrid();
      usersGrid = new ETrainUserGrid() {

         @Override
         public void init() {

            super.init();

            addAction(getCommandFactory().createDtoCommand(ETrainUserCommandFactory.NAVIGATE_TO_USER));

         }

      };

   }
}