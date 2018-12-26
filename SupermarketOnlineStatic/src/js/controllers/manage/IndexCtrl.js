(function () {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('ManageIndexCtrl', ['$scope', '$log', 'DialogService', 'DataService', '$timeout', '$location', ManageIndexCtrl]);

  function ManageIndexCtrl($scope, $log, DialogService, DataService, $timeout, $location) {
    $log.debug('ManageIndexCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function () {
      $log.debug('ManageIndexCtrl destroy...');
    });
    $scope.login = function () {
      DialogService.showWait('登录中，请稍后...');
      DataService.send('/adminuser/login', {
        user: $scope.formdata
      }, function (data) {
        DialogService.hideWait();
        DialogService.showAlert(data.message, function () {
          if (data.success) {
            $timeout(function () {
              $location.hash('typemanage.html');
              $location.path('/route/page/manage/main');
            }, 1);
          } else {
            $timeout(function () {
              $scope.formdata = {};
            }, 1);
          }
        });
      });
    };
  }
})();