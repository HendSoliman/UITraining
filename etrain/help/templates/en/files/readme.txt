This folder is supplied only in order to cover references 
from templates contained in DocHTML templates and documents.

Scripts within this folder do not provide functionality
for a correctly working help system.

In an operational help environment, the folder "files" 
is to be taken from the result of a generation with chm2web!

In an authoring environment, the folder "files" must be placed
directly within the root directory of the help system, for example:

+- root
    +- files
    +- source
         +- app
         |   +- ...
         |   +- gwt_gui
         |   |    +- ...
         |   |    +- doc
         |   |    |   +- de
         |   |    |   |  +- ...
         |   |    |   +- en   
         |   |    |   |  +- ...
         +- <sub>
         |   +- ...
         |   +- <minor sub>
         |   |    +- ...
         |   |    +- doc
         |   |    |   +- de
         |   |    |   |  +- ...
         |   |    |   +- en   
         |   |    |   |  +- ...
         