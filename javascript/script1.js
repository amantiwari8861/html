function createTable() 
{
    let num=document.getElementById("num").value;
    let result=document.getElementById("res");
    let str="";
    // str+=("<table width=\"80%\" border='2' id='tab1' >");
    str+= "<table id='tab1' >" ;
    str+= "<tr>" ;
    str+= "<th> Number </th>" ;
    str+= "<th> Operation </th>" ;
    str+= "<th> Value </th>" ;
    str+= "<th> Operation </th>" ;
    str+= "<th> Value </th>" ;
    str+= "</tr>" ;
    for (let i = 1; i <= 10; i++ )
    {
        str+= "<tr>" ;
        str+= "<td>"+num+"</td>" ;
        str+= "<td>X</td>" ;
        str+= "<td>"+i+"</td>" ;
        str+= "<td>=</td>" ;
        str+= "<td>"+num*i+"</td>" ;
        str+= "</tr>" ;
    }
    str+= "</table>" ;  

    result.innerHTML+=str;
    document.body.innerHTML+=('<link rel="stylesheet" href="style.css">');

}
