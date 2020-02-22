// JavaScript Document
$(function(){
	$(".left1 ul li").click(function(){
		$(this).find("ul").show().siblings();
		$(this).siblings().find("ul").hide();
		})})

$(function(){
	$(".eye_manage_table:not(1) tr").hover(function(){
		$(this).addClass(" eye_hover");
		
		},function(){
			$(this).removeClass(" eye_hover");
			})})
$(function(){
	$(".eye_manage_table:not(1) tr").click(function(){
		$(this).addClass(" eye_visited").siblings().removeClass(" eye_visited");})})
