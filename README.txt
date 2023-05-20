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

