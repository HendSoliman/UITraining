package com.dematic.trainingwarehouse.ui.client.dialog;

import java.util.ArrayList;

import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.wms.app.base.ui.client.scomponent.SAttributePanel;
import com.dematic.wms.app.base.ui.client.scomponent.SDetailDialog;
import com.dematic.wms.app.base.ui.client.scomponent.SLabelPanelEditor;
import com.dematic.wms.app.base.ui.client.scomponent.SLabelPanelEditor.Provided;
import com.dematic.wms.app.base.ui.client.scomponent.editor.SAttribute;
import com.dematic.wms.app.base.ui.client.scomponent.editor.SCollectionEditor;
import com.dematic.wms.app.base.ui.client.scomponent.editor.SCollectionEditor.AssignedListType;
import com.dematic.wms.app.base.ui.client.scomponent.editor.SCollectionEditor.AvailableListType;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

public class AssociateUserToGroupDialog extends SDetailDialog {

   public AssociateUserToGroupDialog() {
      super("associateUserToGroupDialogTitle", AssociateUserToGroupDialog.class);
   }

   @SLabelPanelEditor
   public SAttribute<String> groupName;
   
   @SLabelPanelEditor(provided=Provided.CREATED)
   public SCollectionEditor<ETrainUserDto> users;
   
   

   public void setName(String name) {
      groupName.setAttributeValue(name);
   }

   public ArrayList<ETrainUserDto> getAssignedUsers() {
      return users.getAttributeValue();
   }

   public void setAssignedUsers(ArrayList<ETrainUserDto> eTrainUsers) {
      users.setAttributeValue(eTrainUsers);
   }

   
   
   private static AssociateUserToGroupDialogUiBinder uiBinder = GWT.create(AssociateUserToGroupDialogUiBinder.class);

   interface AssociateUserToGroupDialogUiBinder extends UiBinder<SAttributePanel, AssociateUserToGroupDialog> {
   }

   @Override
   protected Widget createContentPanel() {
      users = new SCollectionEditor<ETrainUserDto>(ETrainUserDto.metaData(), 
               AvailableListType.QueryList, AssignedListType.AutomaticSort, getFunctionalName());
      return uiBinder.createAndBindUi(this);
   }
}