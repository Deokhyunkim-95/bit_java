/**
 * 
 */

function showLoc(srcE, targetId){
    var val = srcE.options[srcE.selectedIndex].value;
    var targetE = document.getElementById(targetId);
    removeAll(targetE);

    if(val == '강남'){
        addOption('강남역', targetE);
        addOption('가로수길', targetE);
        addOption('동작/사당', targetE);
        addOption('방배/반포/잠원', targetE);
        addOption('송파/가락', targetE);
        addOption('여의도', targetE);
        addOption('신사/압구정', targetE);
        addOption('영등포구', targetE);
    }
    else if(val == '강북'){
        addOption('광화문', targetE);
        addOption('연남동', targetE);
        addOption('홍대', targetE);
        addOption('종로', targetE);
        addOption('이태원/한남동', targetE);
        addOption('합정/망원', targetE);
        addOption('용산/숙대', targetE);
    }
}



function addOption(value, e){
    var o = new Option(value);
    try{
        e.add(o);
    }catch(ee){
        e.add(o, null);
    }
    
    $("#loc2").val(value);
    
}

function removeAll(e){
    for(var i = 0, limit = e.options.length; i < limit - 1; ++i){
        e.remove(1);
    }
}