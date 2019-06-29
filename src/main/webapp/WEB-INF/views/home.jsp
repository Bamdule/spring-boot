<%-- 
    Document   : home
    Created on : 2019. 6. 26, 오후 2:55:38
    Author     : MW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="/demo/css/c3/c3.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="chart"></div>

        <script src="/demo/js/lib/d3.v5.min.js"></script>
        <script src="/demo/js/lib/c3.min.js"></script>
        <script>
            var chart = c3.generate({
                bindto: '#chart',
                data: {
                    x: 'x',
                    xFormat: '%Y%m%d',
                    columns: [
                        ['x', new Date('2019-06-19'),new Date('2019-06-20'),new Date('2019-06-21')],
                        ['첫 방문', 405,231,123],
                        ['프리미엄 회원', 0,33,442],
                        ['일반 회원', 3165,4412,412],
                        ['휴먼 회원', 265,333,5512],
                        ['미등록 사용자', 2051,5511,312],
                        ['유료 사용자 합계', 3165,3331,331],
                        ['무료 사용자 합계', 2316,5123,3123],
                        ['전체 합계', 5481,10011,3123],
                        
                        
                    ]
                },
                axis: {
                    x: {
                        type: 'timeseries',
                        tick: {
                            format: "%Y-%m-%d"
                        }
                    }
                }
            });

//            setTimeout(function () {
//                chart.load({
//                    columns: [
//                        ['sample', 200, 130, 90, 240, 130, 100],
//                        ['sample2', 300, 200, 160, 400, 250, 250]
//                    ]
//                });
//            }, 1000);
//
//            setTimeout(function () {
//                chart.load({
//                    columns: [
//                        ['x', '20140101', '20140201', '20140301', '20140401', '20140501', '20140601'],
//                        ['sample', 500, 630, 690, 440, 630, 900],
//                        ['sample2', 400, 600, 460, 200, 350, 450]
//                    ]
//                });
//            }, 2000);
//
//            setTimeout(function () {
//                chart.load({
//                    columns: [
//                        ['x', new Date('2014-01-02T00:00:00Z'), new Date('2014-02-02T00:00:00Z'), new Date('2014-03-02T00:00:00Z'), new Date('2014-04-02T00:00:00Z'), new Date('2014-05-02T00:00:00Z'), new Date('2014-06-02T00:00:00Z')],
//                        ['sample', 500, 630, 690, 440, 630, 900],
//                        ['sample2', 400, 600, 460, 200, 350, 450]
//                    ]
//                });
//            }, 3000);
        </script>
    </body>
</html>
