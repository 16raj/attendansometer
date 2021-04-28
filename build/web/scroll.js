/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    $(window).scroll(function(){
        var scroll=$(window).scrollTop();
        if(scroll>300){
            $("#topbar").css("background","goldenrod");
        }
        else{
            $("#topbar").css("background","activecaption");
        }
    });
});