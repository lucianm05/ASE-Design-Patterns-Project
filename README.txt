# EN

Bachelor's degree final project topic: Disability-optimized component library implemented in React.js. Since design specific OOP patterns cannot be implemented in React.js, I decided to replicate some of the components in Java in a minimal form. These components have different methods, such as onClick, onChange, the equivalent of events that occur as a result of the interaction between the user and the web page in which they are used.

The following design patterns are used in the project: Composite, State, Factory, Singleton, Observer, Facade, Decorator

=================================================================================

felice package - is represented by the component library:

felice.select.composite: design pattern Composite - represented by the Item interface - Select and Option classes implement the Item interface, but only Select can have multiple Item leaf nodes

felice.select.state: Design pattern State - State interface and StateOpen/StateClosed classes to determine whether select is closed or open; if select is closed, its value cannot be updated

felice.form.factory: Design pattern Simple Factory + Singleton - to create multiple FormControl objects used to assemble forms

felice.form.observer: Design pattern Observer - to notify the form when one of the FormControls changes its value

=================================================================================

proiect package - is represented by the use of the component library:

proiect.select.facade: Design pattern Facade - the SelectFacade class has the selectOption method that receives a Select object and the desired option number; it presses the select to open it, then selects the desired option and closes the select

proiect.select.decorator: Design pattern Decorator - abstract Decorator class implements the Item interface from felice.select.composite and has an attribute of type Select, to which it adds the functionality of closing after selecting an option


# RO

Tema licenței: Bibliotecă de componente optimizată pentru accesul persoanelor cu dizabilități, implementată în React.js. Întrucât design patternurile specifice OOP nu pot fi implementate în React.js, am decis să replic o parte dintre componente în Java, într-o formă minimală. Aceste componente au diferite metode, precum onClick, onChange, echivalentul evenimentelor apărute în urma interacțiunii dintre utilizator și pagina web în care sunt folosite.

În proiect sunt folosite următoarele design patternuri: Composite, State, Factory, Singleton, Observer, Facade, Decorator

=================================================================================

Pachetul felice - este reprezentat de biblioteca de componente:

felice.select.composite: Design pattern Composite - reprezentat de interfața Item - clasele Select și Option implementează interfața Item, însă doar Select poate avea mai multe noduri frunză de tip Item

felice.select.state: Design pattern State - interfața State și clasele StateOpen/StateClosed pentru a determina dacă selectul este închis sau deschis; dacă selectul este închis, valoarea acestuia nu poate fi actualizată

felice.form.factory: Design pattern Simple Factory + Singleton - pentru a crea mai multe obiecte de tipul FormControl, folosite la asamblarea formularelor

felice.form.observer: Design pattern Observer - pentru a notifica formularul când unui dintre FormControl-uri își schimbă valoarea

=================================================================================

Pachetul proiect - este reprezentat de utilizarea bibliotecii de componente:

proiect.select.facade: Design pattern Facade - clasa SelectFacade are metoda selectOption care primește un obiect de tip Select și numărul opțiunii dorite; aceasta apasă selectul pentru a-l deschide, după care selectează opțiunea dorită și închide selectul

proiect.select.decorator: Design pattern Decorator - clasa abstractă Decorator implementează interfața Item din felice.select.composite și are un atribut de tipul Select, la care adaugă funcționalitatea de închidere după selectarea unei opțiuni

