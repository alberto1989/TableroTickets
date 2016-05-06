/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 

angular.module('miruta',['ngRoute'])
        .config(function($routeProvider){
        $routeProvider
        .when('/index',{
        templateUrl:'index.html'
        })
        .when('/mensaje',{
        templateUrl:'mensaje.html'
        })
        .when('/busqueda',{
        templateUrl:'busqueda.html'
        
        .when('/update',{
        templateUrl:'update.html'
        })
        
        .when('/borrar',{
        templateUrl:'borrar.html'
        })
        .otherwise({
        redirectTo:'index.html'
        });
        });