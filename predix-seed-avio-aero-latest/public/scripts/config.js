/* global requirejs*/
'use strict';
/**
* This file sets up the basic module libraries you'll need
* for your application.
*/
requirejs.onError = function(err) {
    //console.log(err.requireType);
    if (err.requireType === 'timeout') {
        //console.error('modules: ' + err.requireModules);
    }
    throw err;
};
/**
* RequireJS Config
* This is configuration for the entire application.
*/
require.config({
    enforceDefine: false,
    xhtml: false,
    //Cache buster
    //urlArgs : '_=' + Date.now(),
    waitSeconds: 15,
    config: {
        text: {
            env: 'xhr'
        }
    },
    paths: {
        'bower_components': '../bower_components',
        'px-datasource': '../bower_components/px-datasource/dist/px-datasource.min',

        directives: './directives',

        // Named References
        config: './config',
        app: './app',

        //Angular App Modules
        'sample-module': './sample-module',

        // angularjs + modules
        angular: '../bower_components/angular/angular',
        'angular-mocks': '../bower_components/angular-mocks/angular-mocks',
        'angular-resource': '../bower_components/angular-resource/angular-resource',
        'angular-route': '../bower_components/angular-route/angular-route',
        'angular-sanitize': '../bower_components/angular-sanitize/angular-sanitize',

        // angular ui router
        'angular-ui-router': '../bower_components/angular-ui-router/release/angular-ui-router.min',

        // Require JS Plugins
        text: '../bower_components/requirejs-plugins/lib/text',
        order: '../bower_components/requirejs-plugins/src/order',
        async: '../bower_components/requirejs-plugins/src/async',
        depend: '../bower_components/requirejs-plugins/src/depend',
        font: '../bower_components/requirejs-plugins/src/font',
        goog: '../bower_components/requirejs-plugins/src/goog',
        image: '../bower_components/requirejs-plugins/src/image',
        json: '../bower_components/requirejs-plugins/src/json',
        mdown: '../bower_components/requirejs-plugins/src/mdown',
        noext: '../bower_components/requirejs-plugins/src/noext',
        propertyParser: '../bower_components/requirejs-plugins/src/propertyParser',
        Markdown: '../bower_components/requirejs-plugins/lib/Markdown.Converter',
        css: '../bower_components/require-css/css',
        'css-builder': '../bower_components/require-css/css-builder',
        'normalize': '../bower_components/require-css/normalize',

        underscore: '../bower_components/underscore/underscore',
        jquery: '../bower_components/jquery/dist/jquery.min',

        //brandkit: '../bower_components/brandkit/js/iidx-brandkit',
        //bootstrap: '../bower_components/ge-bootstrap/js',
        //Highcharts plugin
        HighchartsAdapter: '../bower_components/highstock-release/adapters/standalone-framework',
        Highcharts: '../bower_components/highstock-release/highstock.src',
        //highstock: '../bower_components/highstock-release/highstock',
        highchartsmore: '../bower_components/highstock-release/highcharts-more',
        highchart3d: '../bower_components/highstock-release/highcharts-3d',
        heatmap: '../bower_components/highstock-release/modules/heatmap',
        treemap: '../bower_components/highstock-release/modules/treemap',
        
               
    },
    priority: [
        'jquery',
        'angular',
        'angular-resource',
        'angular-route'
    ],
    shim: {
        'angular': {
            deps: ['jquery'],
            exports: 'angular'
        },
        'angular-route': ['angular'],
        'angular-resource': ['angular', 'angular-route', 'angular-ui-router'],
        'angular-sanitize': ['angular'],
        'angular-mocks': {
            deps: ['angular', 'angular-route', 'angular-resource', 'angular-ui-router'],
            exports: 'mock'
        },
        'angular-ui-router': ['angular'],
        underscore: {
            exports: '_'
        },
        'px-datasource': {
            deps: ['angular', 'underscore']
        },
        /*'HighchartsAdapter': {
            exports: 'HighchartsAdapter'
        },*/
        'highchartsmore': {
            //deps: ['jquery'],
            exports: 'Highcharts'
        },
        'highchart3d': {
            //deps: ['jquery'],
            exports: 'Highcharts'
      
        },
        'heatmap': {
            //deps: ['jquery'],
            exports: 'Highcharts'
      
        },
        'treemap': {
            //deps: ['jquery'],
            exports: 'Highcharts'
      
        },
        'app': {
            deps: ['angular']
        }

    }
});
