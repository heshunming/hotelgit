	  function allselect()
	  {
	    if(document.form2.deletes.length==null)
	    {
	      if(document.form2.all.checked==true )
			 {
			  document.form2.deletes.checked=true;
			 }
			 else
			 {
			   document.form2.deletes.checked=false;
			 }
	    }
	    else
	    {
		    for(i=0;i<document.form2.deletes.length;i++)
			{
			 if(document.form2.all.checked==true )
			 {
			  document.form2.deletes[i].checked=true;
			 }
			 else
			 {
			   document.form2.deletes[i].checked=false;
			 }
			}
	    }
	  }
