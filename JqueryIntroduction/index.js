$(document).ready(function () {
            //......VIET CODE O DAY.....
            $('#btn').click(function () {
                var content = $('#test').text();
                $('#txt').val(content);
            });
            $('.box').click(function (e) { //document.getElementById("btn")
                console.log(e);
                $(this).animate({'left': '400px'}, 2000, 'swing');
                // $(this).toggleClass('active');
                // if ($(this).hasClass('active'))
                //     $(this).removeClass('active');
                // else
                //     $(this).addClass('active');
                // $(this).css('background-color', '#00f');
                // alert(1);
            });
            function getRandomInt(max) {
                return Math.floor(Math.random() * Math.floor(max));
            }
            $('.box').mouseenter(function () {
                // console.log("DI chuyen vao trong box ", $(this).text());
                // $(this).css('top', getRandomInt(400) + 'px');
                // $(this).css('left', getRandomInt(600) +'px');
                // $(this).addClass('active');
            })
            $('.box').mouseout(function () {
                console.log("DI chuyen ra ngoafi");
                // $(this).removeClass('active');
            })
            $('#txt').focus(function () {
                console.log("focus");
            })
            $('#txt').blur(function () {
                console.log("blur");
            })
            //----------------------
        })   