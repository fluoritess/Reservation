// JavaScript Document
$(function(){
	$(document).ready(function () {
            $('.main_right_chart1').jqChart({
                title: { text: '基础线状图' },
                axes: [
                        {
                            location: 'left',
                            minimum: 100,
                            maximum: 1000,
                            interval: 100
                        }
                      ],
                series: [
                            {
                                type: 'line',
                                data: [['星期一', 700], ['星期二', 400], ['星期三', 850], ['星期四', 500], ['星期五', 250], ['星期六', 300], ['星期日', 300]]
                            }
                        ]
            });
        });
	})
$(function(){
	 $(document).ready(function () {  
   
            var background = {  
                type: 'linearGradient',  
                x0: 0,  
                y0: 0,  
                x1: 0,  
                y1: 1,  
                colorStops: [{ offset: 0, color: '#fff' },  
                             { offset: 1, color: '#d7f723'}]  
            };  
   
            $('.main_right_chart2').jqChart({  
                title: { text: '复杂线状图' },  
                border: { strokeStyle: '#225474' },  
                background: background,  
                axes: [  
                        {  
                            type: 'categoryAngle',  
                            categories: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月']  
                        },  
                        {  
                            type: 'linearRadius',  
                            renderStyle: 'polygon',  
                            lineWidth: '5',  
                            minimum : 0,  
                            maximum : 100,  
                            interval : 20,  
   
                               
                            majorTickMarks: { visible: true }  
                        }  
                      ],  
                series: [  
                            {  
                                title : '标注1',  
                                type: 'radarArea',  
                                data: [65, 75, 60, 34, 85, 55, 63, 55, 77],  
                                fillStyle: 'rgba(0,51,255,1)' 
                            },  
                            {  
                                title: '标注2',  
                                type: 'radarArea',  
                                data: [1, 23, 86, 30, 23, 35, 89, 67, 38],  
                                fillStyle: 'rgba(255,0,0,1)' 
                            }  
                        ]  
            });  
        });
		})
	$(function(){
		$(document).ready(function () {
            var background = {
                type: 'linearGradient',
                x0: 0,
                y0: 0,
                x1: 0,
                y1: 1,
                colorStops: [{ offset: 0, color: '#95bffe' },
                             { offset: 1, color: 'white'}]
            };
            $('.main_right_chart3').jqChart({
                title: { text: '成绩排名图' },//图表标题
                border: { strokeStyle: '#fff' },//边线颜色
                background: background,/*背景渐变色的调整*/
                animation: { duration: 1 },//动画效果
              
                axes: [/*此处是对轴线的一些优化*/
                        {
                            location: 'left',
                            minimum: 0,
                            maximum: 700,
                            interval: 100
                        }
                      ],
                series: [
                            {
                                title:"班级排名",
                                type: 'line',
                                data: [
                                      ['1班',  1],
                                      ['2班',  20],
                                      ['3班',   60],
                                      ['4班',  500],
                                      ['5班',  300],
                                      ['6班',  200],
                                      ['7班',  268],
                                      ['8班',  423],
                                      ['9班',  321],
                                      ['10班',  456],
                                      ['11班',  385],
                                      ['12班',  578],
                                      ['13班',  512],
                                      ['14班',  456],
                                      ['15班',  478],
                                      ['16班',  356],
                                      ['17班',  478],
                                      ['18班',  189]
                                ]
                            },
                             {
                                title:"名次",
                                type: 'line',
                                data: [
                                      ['1-1班',  200],
                                      ['1-2班',  20],
                                      ['1-3班',  160],
                                      ['1-4班',  200],
                                      ['1-5班',  330],
                                      ['1-6班',  20],
                                      ['2-1班',  68],
                                      ['2-2班',  463],
                                      ['2-3班',  321],
                                      ['2-4班',  486],
                                      ['2-5班',  300],
                                      ['2-6班',  508],
                                      ['3-1班',  312],
                                      ['3-2班',  616],
                                      ['3-3班',  178],
                                      ['3-4班',  556],
                                      ['3-5班',  178],
                                      ['3-6班',  489]
                                ]
                            }
                        ]
            });
        });})