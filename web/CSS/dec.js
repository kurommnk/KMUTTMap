$('#img1').mouseover(function(){
	$("#img1").mouseout(function(){
		$('#img-group').css({
			filter: 'blur(0px)'
		})
	})
	$('#img-group').css({
		filter: 'blur(10px)'
	})

	console.log('img-click')
})
$('#img2').mouseover(function(){
	$("#img2").mouseout(function(){
		$('#img1').css({
		filter: 'blur(0px)'
		})
		$('#img3').css({
			filter: 'blur(0px)'
		})
		$('#img4').css({
			filter: 'blur(0px)'
		})
	})
	$('#img1').css({
		filter: 'blur(10px)'
	})
	$('#img3').css({
		filter: 'blur(10px)'
	})
	$('#img4').css({
		filter: 'blur(10px)'
	})

	console.log('img-click')
})
$('#img3').mouseover(function(){
	$("#img3").mouseout(function(){
		$('#img1').css({
		filter: 'blur(0px)'
		})
		$('#img2').css({
			filter: 'blur(0px)'
		})
		$('#img4').css({
			filter: 'blur(0px)'
		})
	})
	$('#img1').css({
		filter: 'blur(10px)'
	})
	$('#img2').css({
		filter: 'blur(10px)'
	})
	$('#img4').css({
		filter: 'blur(10px)'
	})

	console.log('img-click')
})
$('#img4').mouseover(function(){
	$("#img4").mouseout(function(){
		$('#img1').css({
		filter: 'blur(0px)'
		})
		$('#img3').css({
			filter: 'blur(0px)'
		})
		$('#img2').css({
			filter: 'blur(0px)'
		})
	})
	$('#img1').css({
		filter: 'blur(10px)'
	})
	$('#img3').css({
		filter: 'blur(10px)'
	})
	$('#img2').css({
		filter: 'blur(10px)'
	})

	console.log('img-click')
})