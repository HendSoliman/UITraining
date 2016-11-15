package com.dematic.trainingwarehouse.datasource;

import javax.inject.Inject;

import com.dematic.trainingwarehouse.boundary.ETrainUserProvider;
import com.dematic.wms.app.base.ui.shared.dashboard.Value;
import com.dematic.wms.app.data.control.dummy.SimpleNumberDataSource;
import com.dematic.wms.app.data.control.param.DashboardDataSourceParam;

public class AllUsersDS  extends SimpleNumberDataSource {
 
   private static final long serialVersionUID = 4347420269052914806L;
   @Inject
   ETrainUserProvider userProvider;
 
   public Value<Double> getData(DashboardDataSourceParam dataSourceParam) {
      Value<Double> result;
      result = new Value<Double>((double) userProvider.getAllETrainUsers().size());
      return result;
   }
}