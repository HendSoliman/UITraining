/*************************************************************************
 chm2web Navigation Script 1.0 
 Copyright (c) 2002-2007 A!K Research Labs (http://www.aklabs.com)
 http://chm2web.aklabs.com - HTML Help Conversion Utility
**************************************************************************/

var NV = ["demo/gwt/doc/en/user/WebHelp/index.html","app/gwt_gui/doc/en/user/WebHelp/index.html","app/gwt_gui/doc/en/user/WebHelp/menu/index.html","app/gwt_gui/doc/en/user/WebHelp/dialogs/app/gwt/gui/client/um/dialogs/UserDialog.html","app/gwt_gui/doc/en/user/WebHelp/dialogs/app/gwt/gui/client/um/dialogs/UserSubDialog.html","app/gwt_gui/doc/en/user/WebHelp/dialogs/app/gwt/gui/client/tm/dialogs/TerminalDialog.html","app/gwt_gui/doc/en/user/WebHelp/dialogs/app/gwt/gui/client/tm/dialogs/TerminalSubDialog.html","mfc/gwt/doc/en/user/WebHelp/index.html","mfc/gwt/doc/en/user/WebHelp/menu/index.html","mfc/gwt/doc/en/user/WebHelp/dialogs/mfc/gwt/client/messagetrace/MessageTraceDialog.html","mfc/gwt/doc/en/user/WebHelp/dialogs/mfc/gwt/client/messagetrace/MessageTraceDetailDialog.html","mfc/gwt/doc/en/user/WebHelp/dialogs/mfc/gwt/client/connectstate/ConnectStateDialog.html","mfc/gwt/doc/en/user/WebHelp/dialogs/mfc/gwt/client/traorder/TraOrderDialog.html","mfc/gwt/doc/en/user/WebHelp/dialogs/mfc/gwt/client/traorder/TraorderDetailDialog.html"];
var s = "source/";
function getNav(op) { var p=chmtop.c2wtopf.pageid;var n=s+p; var m=NV.length-1;for(i=0;i<=m;i++){if(NV[i]==p){if(op=="next"){if (i<m) {curpage=i+1;return s+NV[i+1];} else return n;}else{if(i>0) {curpage=i-1;return s+NV[i-1];} else return n;}}} return n;}
function syncTopic(){open('helpheaderc.html', 'header');open('helpcontents.html','toc');}
