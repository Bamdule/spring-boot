<%-- 
    Document   : home
    Created on : 2019. 6. 21, 오후 2:10:16
    Author     : MW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="/demo/css/c3/c3.css" rel="stylesheet" type="text/css">
        <!--<script src="/demo/js/page/app.js"></script>-->
    </head>
    <body>
        <script src="/demo/js/lib/d3.v5.min.js"></script>
        <script src="/demo/js/lib/c3.min.js"></script>
        <script>
            var chart = c3.generate({
                data: {
                    columns: [
                        ['data1', 30, 200, 100, 400, 150, 250],
                        ['data2', 50, 20, 10, 40, 15, 25]
                    ],
                    axes: {
                        data1: 'y',
                        data2: 'y2',
                    }
                },
                axis: {
                    x: {
                        label: 'X Label'
                    },
                    y: {
                        label: {
                            text: 'Y Axis Label',
                            position: 'outer-middle'
                        }
                    },
                    y2: {
                        show: true,
                        label: {
                            text: 'Y2 Axis Label',
                            position: 'outer-middle'
                        }
                    }
                },
                tooltip: {
                    //          enabled: false
                },
                zoom: {
                    //          enabled: true
                },
                subchart: {
                    //          show: true
                }
            });

            setTimeout(function () {
                chart.axis.labels({
                    x: 'New X Axis Label',
                    y: 'New Y Axis Label',
                    y2: 'New Y2 Axis Label',
                });
            }, 1000);

            setTimeout(function () {
                chart.load({
                    columns: [
                        ['data1', 100, 300, 600, 200, 400, 500]
                    ]
                });
                chart.axis.labels({y: 'New Y Axis Label Again'});
            }, 2000);

        </script>
    </body>
</html>
