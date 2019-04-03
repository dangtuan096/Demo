$(document).ready(function(){
	$("#col1").click(function(){
		$(this).addClass("activeLink")
	});
	$("#col1").click(function(){
		var chuoi = $("#col1").attr("data-text");
		alert(chuoi);	
	});
	
	$("#btndangnhap").click(function(){
		var ten = $("#email").val();
		var password = $("#matkhau").val();
		$.ajax({
			  url:"/thoitrang/api/KiemTraDangNhap",
			  type:"GET",
			  data:{
				  email:ten,
				  matkhau:password,
			  },
			  success: function(value) {
				if(value == "true"){
					duongDanHienTai = window.location.href;
					duongDan = duongDanHienTai.replace("dangnhap/","");
					window.location = duongDan;
					$("#ketqua").text("đăng nhập thành công");
				}else{
					$("#ketqua").text("đăng nhập thất bại");
				}
			}
			})
	});
	$("#dangnhap").click(function(){
		$(".container-login-form").show();
		$(".container-signup-form").css("display","none");
	})
	$("#dangky").click(function(){
		$(".container-login-form").css("display","none");
		$(".container-signup-form").show();
	})
})


