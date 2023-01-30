// $(document).ready(()=>alert("jquery applied!"));

    //pure js
    // let hobj=document.querySelector(".head1");
    // hobj.addEventListener("click",()=>{
    //     alert("clicked on head1 class");
    // })

    //jquery and js
    // let hobj=document.querySelector(".head1");
    // $(hobj).click(()=>alert("clicked on head1 "));
    
    //pure jquery
    // $(".head1").click(()=>alert("clicked on head1 "));

    // $(".head1").click(()=>{
    //in arrow function this selector won't work that's why 
    // $(".head1").click(function abc(){
    //     alert("clicked on head1 ");
    //     // $(".head1").css("color","greenyellow");
    //     $(this).css("color","greenyellow");
    // });

    $(document).ready(function op1() {
        
        $("#hide").click(function hide1() {
            $(".head1").hide("slow");
        })
        $("#show").click(()=> {
            $(".head1").show("slow");
        })
        $("#toggle").click(()=> {
            $(".head1").toggle(6000,status1);
        })
        $("#fadein").click(()=> {
            $(".head1").fadeIn("slow",status1);
        })
        $("#fadeout").click(()=> {
            $(".head1").fadeOut("slow",status1);
        })
        $("#fadeto").click(()=> {
            $(".head1").fadeTo("slow",0.5,status1);
        })
        $("#fadeto2").click(()=> {
            $(".head1").fadeTo("slow",0.7,status1);
        })
        $("#fadetoggle").click(()=> {
            $(".head1").fadeToggle("slow",status1);
        })
        $("#slideup").click(()=> {
            $(".head1").slideUp("slow",status1);
        })
        $("#slidedown").click(()=> {
            $(".head1").slideDown("slow",status1);
        })
        $("#slidetoggle").click(()=> {
            $(".head1").slideToggle("slow",status1);
        })

    });

    function status1()
    {
        alert("animation completed!!");
    }
