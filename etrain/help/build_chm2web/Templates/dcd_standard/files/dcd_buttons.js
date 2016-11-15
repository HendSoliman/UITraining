/*************************************************************************

   Script for handling of events from buttons within help system
   Copyright (c) 2011 Dematic GmbH
    
   $Id: $
               
**************************************************************************/
var EDITOK    = "EditOk";
var EDITNOTOK = "EditNotOk";
var TREEVISIBLE    = "TreeVisible";
var TREENOTVISIBLE = "TreeNotVisible";

function isEditOK(doc) {
   var c   = "";
   var res = "False";

   c = doc.cookie;
   if (c.indexOf(EDITOK) >= 0) {
     res = "True";
   }
   return res;
}

function editIsOk(doc) {
   var c   = "";
   var exp = new Date("December 31, 2099 23:59:59");
   c = doc.cookie;
   if (c.length == 0) {
     c = EDITOK;
     c = c + "; expires=" + exp.toGMTString();
     doc.cookie = c;
   } else {
     if (c.indexOf(EDITOK) == -1) {
       if (c.indexOf(EDITNOTOK) >= 0) {
         c = c.replace(/EditNotOk/g, EDITOK);     
       } else {
         c = c + "," + EDITOK;
       }
       c = c + "; expires=" + exp.toGMTString();
       doc.cookie = c;
     }
   }
}

function editIsNotOk(doc) {
   var c   = "";
   var exp = new Date("December 31, 2099 23:59:59");

   c = doc.cookie;
   if (c.length == 0) {
     c = EDITNOTOK;
     c = c + "; expires=" + exp.toGMTString();
     doc.cookie = c;
   } else {
     if (c.indexOf(EDITNOTOK) == -1) {
       if (c.indexOf(EDITOK) >= 0) {
         c = c.replace(/EditOk/g, EDITNOTOK);     
       } else {
         c = c + "," + EDITNOTOK;
       }
       c = c + "; expires=" + exp.toGMTString();
       doc.cookie = c;
     }
   }
}

function DocLoaded(doc, pgHead)
{
/* Control button activation dependent on active document
*/
   var isActive;
   var img;
   var anc;
   var tit;
   
/* Overview button */
   isActive = "False";
   if (doc) {
/*   Check hRef of overview anchor */
     anc = doc.getElementById("uplinkO");
     if (anc) {
       if (anc.href != "") {
         isActive = "True";
       }
     }
   }
   if (pgHead) {
     img = pgHead.getElementById("dcdOverview");
     if (img) {
       if (isActive == "True") {
         img.src = "files/overview.gif";
       } else {
         img.src = "files/overview_i.gif";
       }
     }
     img = pgHead.getElementById("dcdOverviewBg");
     if (img) {
       if (isActive == "True") {
         img.src = "files/button.gif";
       } else {
         img.src = "files/button_i.gif";
       }
     }
   }
/* Parent button */
   isActive = "False";
   if (doc) {
/*   Check hRef of overview anchor */
     anc = doc.getElementById("uplinkP");
     if (anc) {
       if (anc.href != "") {
         isActive = "True";
       }
     }
   }
   if (pgHead) {
     img = pgHead.getElementById("dcdParent");
     if (img) {
       if (isActive == "True") {
         img.src = "files/parent.gif";
       } else {
         img.src = "files/parent_i.gif";
       }
     }
     img = pgHead.getElementById("dcdParentBg");
     if (img) {
       if (isActive == "True") {
         img.src = "files/button.gif";
       } else {
         img.src = "files/button_i.gif";
       }
     }
   }
}

function dcd_highlighInContext(tb, idBg, id, doc, btnId) {
/* Set button highlighting and tooltip 
   according to up-links in currently loaded document
*/
   var isActive;
   var img;
   var anc;
   var tit;
   
   isActive = "False";
   tit = "";
   if (doc) {
/*   Check hRef of anchor */
     anc = doc.getElementById(btnId);
     if (anc) {
       if (anc.href != "") {
         isActive = "True";
       }
     } 
/*   Get tooltip from image title */
     img = doc.getElementById(btnId + "_img");
     if (img) {
       tit = img.title;
     } 
   }
   
/* Set button properties */
   if (isActive == "True") {
     tb.getElementById(idBg).src = "files/button_hover.gif";
     tb.getElementById(id).title = tit;
   } else {
     tb.getElementById(idBg).src = "files/button_i.gif";
     tb.getElementById(id).title = tb.getElementById(id).alt;
   }
}

function dcd_highlighInContextOff(tb, idBg, id, doc, btnId) {
/* Switch button highlighting off 
   according to up-links in currently loaded document
*/
   var isActive;
   var img;
   var anc;
   var tit;
   
   isActive = "False";
   tit = "";
   if (doc) {
/*   Check hRef of anchor */
     anc = doc.getElementById(btnId);
     if (anc) {
       if (anc.href != "") {
         isActive = "True";
       }
     } 
/*   Get tooltip from image title */
     img = doc.getElementById(btnId + "_img");
     if (img) {
       tit = img.title;
     } 
   }
   
/* Set button properties */
   if (isActive == "True") {
     tb.getElementById(idBg).src = "files/button.gif";
   } else {
     tb.getElementById(idBg).src = "files/button_i.gif";
   }
}

function dcd_highlightOn(doc, id) {
/* Set the given element visible
   Typically used for background of buttons
*/
   var isActive;
   var img;
/* Determine whether a button is active */
    isActive = "True";
    if (id == "xxxxxx") {
      isActive = "False";
    }
    
   if (isActive == "True") {
     img = doc.getElementById(id);
     img.src = "files/button_hover.gif";
   }
}

function dcd_highlightOff(doc, id) {
/* Set the given element invisible
   Typically used for background of buttons
*/
   doc.getElementById(id).src = "files/button.gif";
}

function dcd_editDocument(docBtn, btnName, docTgt, hintFile) {
/* Open document in editor
*/
   var infoWin = "";
   var e       = "";
   
   e = isEditOK(docBtn);
   if (e == "False") {
     if (navigator.cookieEnabled == false) {
       alert("You have disabled cookies. Therefore, the following hint will be shown always when the Edit button is pressed.");
     }
     infoWin = window.open(hintFile, "InfoWinEdit", 
                          "dependent=yes,height=820,width=700,location=no,menubar=no,resizable=yes,scrollbars=yes,toolbar=no");
   }
   docBtn.getElementById(btnName).href = "htmledit:" + docTgt.URL;
}

function dcd_refreshDocument(doc) {
/* Open document in editor
*/
   doc.location.reload();
}

function dcd_goTo(win, curDoc, btnId) {
/* Open document associated with an up-link in the active document
*/
   var anc;
   var tgt;
   
   if (curDoc) {
/*   get hRef from anchor */
     anc = curDoc.getElementById(btnId);
     if (anc) {
       tgt = anc.href;
       if (tgt != "") {
         if (win) {
           win.location.href = tgt;
         }
       }
     } 
   }
}

function dcd_goBack(win) {
/* Open previous document in editor
*/
   history.back();
}

function dcd_goForward(win) {
/* Open next document in editor
*/
   history.forward();
}

function dcd_copyUrlToClipboard(doc, docTgt) {
/* Copy the URL to the clipboard
*/
   var lt = docTgt.URL;
   var p = lt.indexOf("root/source");
   if (p < 0) {
     p = lt.indexOf("root\\source");
   }
   if (p >= 0) {
     var pp = lt.substring(p + 5);
	 pp = pp.replace(/\\/g, "%2F");
	 pp = pp.replace(/\x2F/g, "%2F");
	 lt = lt.substring(0, p + 4);
	 lt = lt.replace(/\\/g, "/");
	 lt = lt + "/index.html?page=" + pp;
   }
   if (window.clipboardData && clipboardData.setData) {
     clipboardData.setData("text", lt);
     alert("Hyperlink target copied to Clipboard:\n\n" + lt);
   } else {
     var lnkWin = window.open("about:blank", "Link_Target", "dependent=yes,height=200,width=900,location=no,menubar=no,status=no,resizable=yes,scrollbars=yes,toolbar=no");
	 var doc = lnkWin.document;
	 doc.write('<html><head><style type="text/css">.style1{font-family:Arial;}</style></head><body><p class="style1">Copy to Clipboard is not supported for this browser:<br>Please copy the following link target manually:<br><br>' + lt + "</p></body></html>");
   }
}

function dcd_help(doc, helpfile) {
/* Open help document
*/
   var helpWin = "";
   helpWin = window.open(helpfile, "HelpWin", 
                        "dependent=yes,height=850,width=700,location=no,menubar=no,resizable=yes,scrollbars=yes,toolbar=no");   
}

function dcd_close(win) {
/* Close window
*/
   win.close(); 
}

function dcd_toggleEditOk(doc, id) {
/* toggle the editOK state which controls whether or not to show the info window for editing
*/
   var el = doc.getElementById(id);
   if (el.checked  == true) {
     editIsOk(doc);
   } else {
     editIsNotOk(doc);
   }
}

function dcd_toggleCookie(doc) {
/* toggle the editOK state which controls whether or not to show the info window for editing
*/
   if (isEditOK(doc)  == "False") {
     editIsOk(doc);
   } else {
     editIsNotOk(doc);
   }
   alert("Cookie is now:" + doc.cookie);
}

function isTreeVisible(doc) {
   var c   = "";
   var res = "False";

   c = doc.cookie;
   if (c.indexOf(TREEVISIBLE) >= 0) {
     res = "True";
   }
   return res;
}

function treeIsVisible(doc) {
   var c   = "";
   var exp = new Date("December 31, 2099 23:59:59");
   c = doc.cookie;
   if (c.length == 0) {
     c = TREEVISIBLE;
     c = c + "; expires=" + exp.toGMTString();
     doc.cookie = c;
   } else {
     if (c.indexOf(TREEVISIBLE) == -1) {
       if (c.indexOf(TREENOTVISIBLE) >= 0) {
         c = c.replace(/TreeNotVisible/g, TREEVISIBLE);     
       } else {
         c = c + "," + TREEVISIBLE;
       }
       c = c + "; expires=" + exp.toGMTString();
       doc.cookie = c;
     }
   }
}

function treeIsNotVisible(doc) {
   var c   = "";
   var exp = new Date("December 31, 2099 23:59:59");

   c = doc.cookie;
   if (c.length == 0) {
     c = TREENOTVISIBLE;
     c = c + "; expires=" + exp.toGMTString();
     doc.cookie = c;
   } else {
     if (c.indexOf(TREENOTVISIBLE) == -1) {
       if (c.indexOf(TREEVISIBLE) >= 0) {
         c = c.replace(/TreeVisible/g, TREENOTVISIBLE);     
       } else {
         c = c + "," + TREENOTVISIBLE;
       }
       c = c + "; expires=" + exp.toGMTString();
       doc.cookie = c;
     }
   }
}

function dcd_toggleTree(doc) {
/* Toggle navigation tree
*/
   var el = doc.getElementById("contentarea");
   var cl = el.cols;
   if (cl == "0,*") {
     el.cols = "230,*"
     treeIsVisible(doc);     
   } else {
     el.cols = "0,*";
     treeIsNotVisible(doc);     
   }
}

function dcd_initializeTree(doc) {
/* Toggle navigation tree
*/
   var el = doc.getElementById("contentarea");
   var cl = el.cols;
   if (isTreeVisible(doc) == "True") {
     el.cols = "230,*"
   } else {
     el.cols = "0,*";
   }
}
