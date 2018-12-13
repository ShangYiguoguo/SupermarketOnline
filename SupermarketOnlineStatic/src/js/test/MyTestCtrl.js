(function() {
  var ctrls = angular.module('controllers');
  ctrls.controller('TsetMyTestCtrl', ['$scope', '$log','DialogService','DataService','MyUtilService', TsetMyTestCtrl]);

  function TsetMyTestCtrl($scope, $log,DialogService,DataService,MyUtilService) {
    $log.debug('TsetMyTestCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function() {
      $log.debug('TsetMyTestCtrl destroy...');
    });
    DialogService.showWait('获取后台数据中');
    DataService.send('/',{echo:new Date().getTime()},function(data){
      DialogService.hideWait();
      $scope.info=MyUtilService.trustAsHtml(
        MyUtilService.jsonSyntaxHighlight(
          MyUtilService.formatJson(JSON.stringify(data))));
    });
  }
})();
