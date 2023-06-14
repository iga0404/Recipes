package com.example.recipes

class Recipe(val name: String, val recipe: String, val imageResourceId: Int) {
    companion object {
        val category1 = arrayOf(
            Recipe(
                "Kurczak curry",
                "Filety pokroić na małe kawałki. Doprawić solą, pieprzem oraz przyprawą curry.\n" +
                        "Dodać przeciśnięty przez praskę czosnek oraz łyżkę oliwy i wymieszać. Odłożyć do zamarynowania jeśli mamy czas.\n" +
                        "Przed smażeniem kurczaka wymieszać z mąką.\n" +
                        "W międzyczasie ugotować ryż w osolonej wodzie (kolorowy gotuje się zazwyczaj 20 minut).\n" +
                        "W drugim garnku ugotować pokrojone na mniejsze kawałki warzywa.\n" +
                        "Rozgrzać olej na patelni. Wrzucić kurczaka i obsmażyć z każdej strony, co chwilę zamieszać.\n" +
                        "Wlać śmietankę, gotować przez ok. 3 minuty pod przykryciem.\n" +
                        "Zdjąć pokrywę, odstawić z ognia i posypać natką pietruszki.\n" +
                        "Podawać z ugotowanymi warzywami i ryżem. Kurczaka w sosie skrapiać na talerzach sokiem z limonki.",
                R.drawable.kurczak_curry,
            ),
            Recipe(
                "Kurczak w pieprzu",
"Udka pokroić na mniejsze kawałki (ok. 2 cm). Doprawić solą oraz pieprzem młotkowanym, odłożyć do zamarynowania jeśli mamy czas.\n" +
        "W międzyczasie można nastawić ryż i ugotować zgodnie z instrukcją na opakowaniu oraz przygotować resztę składników do kurczaka: czosnek, imbir oraz świeżą kurkumę obrać i zetrzeć na drobnej tarce. Cebulę obrać i pokroić na cienkie plasterki.\n" +
        "Rozgrzać dużą patelnię z nieprzywierającą powłoką z olejem i dokładnie obsmażyć na złoto pierwszą partię kurczaka (w sumie około 8 - 10 minut), zdjąć z patelni na talerz i powtórzyć smażenie z drugą partią kurczaka. Można też użyć 2 patelni aby przyspieszyć przygotowania.\n" +
        "Na tę samą patelnię włożyć imbir, czosnek, świeżą kurkumę oraz cebulę. Smażyć na umiarkowanym ogniu, mieszając co chwilę, przez około 4 minuty aż zmięknię. Na koniec dodać kurkumę w proszku.\n" +
        "Dodać posiekane pomidory oraz wodę lub bulion i zagotować. Gotować pod przykryciem przez ok. 2 - 3 minuty.\n" +
        "Włożyć z powrotem kurczaka i zagotować. Gotować pod przykryciem do miękkości przez ok. 10 minut, w międzyczasie 2 - 3 razy zamieszać. Podawać z kolendrą oraz ryżem.",
                R.drawable.kurczak_w_pieprzu,
            ),
            Recipe(
                "Polędwiczka z pieczarkami i porem",
"Polędwicę umyć, osuszyć, odciąć białą błonę, następnie pokroić ukośnie na plastry o grubości 2,5 cm. \n" +
        "Rozbić je płaskim tłuczkiem i natrzeć czosnkiem przeciśniętym przez praskę. Włożyć do lodówki na ok. 1 godzinę (jeśli mamy czas).\n" +
        "Doprawić solą i pieprzem a następnie delikatnie oprószyć skrobią ziemniaczaną.\n" +
        "Rozgrzać dużą patelnię z 2 łyżkami oleju. Obsmażyć polędwiczki po około 2,5 minuty z każdej strony. Odłożyć na talerz.\n" +
        "Na tę samą patelnię wlać pozostałą łyżkę oleju, dodać posiekanego pora, obrany i starty imbir i umyte pieczarki (większe można pokroić). Smażyć przez około 3 - 5 minut co chwilę mieszając (jeśli za bardzo się przypala można skropić patelnię wodą).\n" +
        "Włożyć z powrotem mięso na patelnię z warzywami i po chwili wlać sos (wymieszane składniki).\n" +
        "Gotować przez około 2 minuty aż sos zgęstnieje, w międzyczasie co chwilę zamieszać (potrząsnąć patelnią, przewrócić mięso na drugą stronę).",
                R.drawable.poledwiczka,
            ),
            Recipe(
                "Zupa enchilada z kurczakiem",
"W szerokim garnku na oleju zeszklić pokrojoną w kostkę cebulę.\n" +
        "Dodać drobno starty czosnek oraz starte na większych oczkach tarki - marchewkę i selera. Smażyć co chwilę mieszając przez około 5 minut.\n" +
        "Dodać masło oraz pokrojony w niedużą kostkę filet kurczaka. Doprawić go większą szczyptą soli, pieprzem oraz dodać wszystkie przyprawy. Mieszając obsmażać przez około 5 minut.\n" +
        "Dodać pokrojoną w kosteczkę paprykę i smażyć przez 2 minuty, w razie potrzeby dodać więcej oleju. Dodać posiekane suszone pomidory.\n" +
        "Wlać gorący bulion i zagotować. Dodać wcześniej zmiksowane pomidory z puszki, wymieszać i gotować przez ok. 10 minut bez przykrycia lub pod uchyloną pokrywą.\n" +
        "Dodać odcedzone kukurydzę i fasolę z puszki (lekko opłukane na sicie), wymieszać i gotować jak powyżej przez ok. 10 minut, w międzyczasie dodać koncentrat.\n" +
        "Dodać natkę pietruszki i mieszając gotować przez ok. 1 - 2 minuty.\n" +
        "Podawać z tartą mozzarellą, papryczkami i chipsami kukurydzianymi z tortilli. Można posypać kolendrą i pokrojonym awokado.",
                R.drawable.zupazkurczakiem,
            ),
            Recipe(
                "Kurczak po tajsku",
"Filety oczyścić i pokroić w kostkę. Doprawić solą, pieprzem i połową pasty curry. Oprószyć skrobią ziemniaczaną.\n" +
        "Rozgrzać 1 łyżkę oleju w woku lub dużej głębokiej patelni, włożyć pokrojoną w piórka cebulę oraz posiekaną papryczkę chili (bez pestek) i drugą łyżeczkę pasty curry. Opcjonalnie można też dodać trawę cytrynową (obraną z zewnętrznych liści i zgniecioną płaską częścią noża). Chwilę podsmażyć co chwilę mieszając. \n" +
        "Cebulę przesunąć na brzeg woka, w wolne miejsce włożyć drugą łyżkę oleju. Dodać kurczaka i obsmażać przez ok. 5 minut.\n" +
        "Wlać mleko kokosowe i zagotować. Gotować przez ok. 4 minuty, w międzyczasie dodać sos rybny (lub sojowy) oraz sok z limonki i opcjonalnie liście kafiru. Na koniec posypać szczypiorkiem oraz opcjonalnie dodatkową chili. Podawać z ryżem.",
                R.drawable.kurczak_po_tajsku,
            ),
            Recipe(
                "Kurczak z brokułami po chińsku",
"Filet kurczaka pokroić w kostkę, doprawić solą i pieprzem a następnie obtoczyć w skrobi ziemniaczanej.\n" +
        "Nastawić osoloną wodę w większym garnku. Na wrzątek wrzucić pokrojone różyczki brokuła a następnie wyłowić je łyżką cedzakową po 2 minutach od włożenia. W tym samym wrzątku ugotować ryż.\n" +
        "Cebulę pokroić w kosteczkę. Czosnek oraz imbir obrać i zetrzeć na małej tarce. Papryczkę chili przekroić wzdłuż, usunąć pestki, następnie posiekać.\n" +
        "Przygotowane powyżej składniki wrzucić na rozgrzane 2 łyżki oleju w woku lub na dużej patelni. Zeszklić mieszając łopatką przez około 2 minuty na średnim ogniu.\n" +
        "Zwiększyć ogień, wlać pozostałą łyżkę oleju i dodać kurczaka. Obsmażać co chwilę mieszając przez ok. 5 - 7 minut.\n" +
        "Dodać składniki sosu i wymieszać. Gotować przez ok. 2 - 3 minuty, na koniec dodać brokuły, wymieszać i razem zagotować.\n" +
        "Podawać z ugotowanym ryżem, posypać lekko zrumienionym sezamem i listkami kolendry (opcjonalnie).",
                R.drawable.kurczak_po_chinsku,
            ),
            Recipe(
                "Krewetki w sosie limonkowo-kokosowym",
"Nastawić do ugotowania ryż. Krewetki rozmrozić jeśli były mrożone, oczyścić i usunąć pancerze. Cebulę drobno posiekać, paprykę pokroić w drobną kostkę.\n" +
        "Na patelni na oleju podsmażyć cebulę, dodać starty czosnek i imbir, po chwili dodać pokrojoną paprykę. Smażyć wszystko mieszając ok. 3 minuty.\n" +
        "Dodać krewetki i krótko (1 min) obsmażyć. Dodać mleko kokosowe, słodki sos chili, sos rybny oraz startą skórkę i sok z limonki. Zagotować.\n" +
        "Na koniec dodać plasterki chili oraz posypać kolendrą (lub bazylią), podawać z ryżem.",
                R.drawable.krewetki,
            ),
            Recipe(
                "Żurek błyskawiczny",
"W garnku zagotować bulion z dodatkiem wędzonki. Przykryć i gotować na małym ogniu przez ok. 30 minut.\n" +
        "Dodać żurek z butelki (wcześniej potrząsnąć butelką w celu przemieszania zawartości) oraz śmietanę i majeranek. Dokładnie wymieszać i na zagotować na małym ogniu.\n" +
        "Doprawić zmielonym pieprzem w razie potrzeby oraz dodać obraną z błonki i pokrojoną na kawałki kiełbasę. Podgrzać i podawać z dodatkami.",
                R.drawable.zurek,
            ),
        )

        val category2 = arrayOf(
            Recipe(
                "Zupa z cukinią, ziemniakami i fetą",
"W garnku na oliwie i maśle zeszklić pokrojoną w kosteczkę cebulę (co chwilę mieszając, na średnim ogniu, ok. 5 minut).\n" +
        "Dodać obrane i pokrojone w małą kostkę ziemniaki i wymieszać. Podsmażać razem przez ok. 2 - 3 minuty co chwilę mieszając.\n" +
        "Dodać starty czosnek, wlać bulion i zagotować. W międzyczasie dodać kurkumę, pieprz oraz w razie potrzeby sól do smaku.\n" +
        "Po zagotowaniu gotować zupę przez ok. 2 - 3 minuty, następnie dodać pokrojoną w kostkę cukinię (nieco większą niż ziemniaki). Gotować przez ok. 8 - 10 minut.\n" +
        "Odstawić z ognia, dodać koperek oraz śmietankę. Podawać z fetą oraz pieczywem.",
                R.drawable.zupa_z_cukinia,
            ),
            Recipe(
                "Makaron pieczony z fetą i pomidorkami",
"Piekarnik nagrzać do 190 stopni C. Do żaroodpornej formy włożyć ser feta i posypać opłukanymi pomidorkami koktajlowymi.\n" +
        "Posypać oregano, doprawić solą oraz pieprzem i polać oliwą. Wstawić do nagrzanego piekarnika na 30 minut.\n" +
        "W międzyczasie nastawić wodę na makaron, posolić ją i ugotować makaron zgodnie z instrukcją na opakowaniu (zachować 1/2 szklanki wody z gotowania). Odcedzić i wymieszać z przeciśniętym przez praskę czosnkiem.\n" +
        "Widelcem rozgnieść upieczoną fetę z pomidorkami, posypać bazylią, dodać makaron i wymieszać (w razie potrzeby można dodać wodę z makaronu gdyby był za suchy). Można doprawić solą i pieprzem w razie potrzeby oraz dodać więcej oliwy.",
                R.drawable.makaron_z_feta,
            ),
            Recipe(
                "Makaron ze szparagami",
"Szparagi umyć, odłamać twarde końce (same złamią się we właściwym miejscu). Odłamanych końców nie należy używać, bo są bardzo włókniste i niesmaczne.\n" +
        "Zielone części szparagów pokroić w poprzek na kawałeczki zachowując zielone główki w całości.\n" +
        "Nastawić duży garnek z wodą na makaron, osolić. Makaron wrzucić na wrzątek i gotować al dente zgodnie z instrukcją na opakowaniu, zazwyczaj ok. 9 minut (zależy od grubości makaronu).\n" +
        "Na 3 minuty przed końcem gotowania wrzucić do garnka szparagi i gotować do końca.\n" +
        "W międzyczasie na dużej patelni na 2 łyżkach oliwy delitanie podsmażyć drobno starty lub przeciśnięty przez praskę czosnek.\n" +
        "Wlać sok z cytryny i pogotować przez minutę.\n" +
        "Dodać pozostałe 2 łyżki oliwy, skórkę z cytryny oraz gotowy, odcedzony makaron ze szparagami.\n" +
        "Wymieszać, następnie doprawić solą, pieprzem i dodać posiekaną natkę pietruszki. Ponownie wymieszać w międzyczasie dodając starty ser.\n" +
        "Wyłożyć do talerzy, doprawić solą z młynka w razie potrzeby, skropić dodatkową oliwą oraz posypać dodatkowym parmezanem.",
                R.drawable.makaron_ze_szparagami,
            ),
            Recipe(
                "Leczo wegetariańskie",
"Szparagi umyć, odłamać twarde końce (same złamią się we właściwym miejscu). Odłamanych końców nie należy używać, bo są bardzo włókniste i niesmaczne.\n" +
        "Zielone części szparagów pokroić w poprzek na kawałeczki zachowując zielone główki w całości.\n" +
        "Nastawić duży garnek z wodą na makaron, osolić. Makaron wrzucić na wrzątek i gotować al dente zgodnie z instrukcją na opakowaniu, zazwyczaj ok. 9 minut (zależy od grubości makaronu).\n" +
        "Na 3 minuty przed końcem gotowania wrzucić do garnka szparagi i gotować do końca.\n" +
        "W międzyczasie na dużej patelni na 2 łyżkach oliwy delitanie podsmażyć drobno starty lub przeciśnięty przez praskę czosnek.\n" +
        "Wlać sok z cytryny i pogotować przez minutę.\n" +
        "Dodać pozostałe 2 łyżki oliwy, skórkę z cytryny oraz gotowy, odcedzony makaron ze szparagami.\n" +
        "Wymieszać, następnie doprawić solą, pieprzem i dodać posiekaną natkę pietruszki. Ponownie wymieszać w międzyczasie dodając starty ser.\n" +
        "Wyłożyć do talerzy, doprawić solą z młynka w razie potrzeby, skropić dodatkową oliwą oraz posypać dodatkowym parmezanem.",
                R.drawable.leczo_wege,
            ),
            Recipe(
                "Kopytka z batatów",
"Piekarnik nagrzać do 200 stopni C.\n" +
        "Bataty obrać a następnie pokroić na plasterki o grubości ok. 1,5 cm.\n" +
        "Plastry ułożyć jeden obok drugiego na blaszce do pieczenia wyłożonej pergaminem i wstawić do piekarnika. Piec przez 25 minut.\n" +
        "Po przestudzeniu rozgnieść praską (jak ziemniaki) lub zmiksować w rozdrabniaczu.\n" +
        "Na stolnicę wysypać mąkę, dodać bataty, jajko oraz sól.\n" +
        "Zagarniając mąkę do środka zagnieść składniki w luźne i klejące ciasto (będzie się lepiło, ale takie ma być). Podczas formowania ciasta w razie potrzeby można podsypywać dodatkową mąką, ale nie za dużo, bo im więcej mąki tym kluski bardziej zwarte po ugotowaniu.\n" +
        "Ciasto podzielić na 2 części, jedną odłożyć, drugą podzielić na 3 cześci i z każdej uformować wałeczek. To samo zrobić z drugą połową ciasta.\n" +
        "Pokroić nożem na poprzeczne kopytka i wrzucić w 2 partiach na zagotowaną wodę w dużym garnku. Gotować do wypłynięcia na powierzchnię, czyli w sumie przez ok. 2 - 3 minuty.\n" +
        "Wyłowić łyżką cedzakową i wyłożyć na talerz.\n" +
        "Na patelni na oliwie podsmażyć przekrojony na pół obrany ząbek czosnku.\n" +
        "Papryczkę przekroić wzdłuż na pół i usunąć pestki, następnie pokroić w kosteczkę. Na patelnię z czosnkiem dodać papryczkę i chwilę razem podsmażyć.\n" +
        "Dodać pomidory, doprawić solą, wymieszać i gotować przez około 3 minuty.\n" +
        "Kopytka wyłożyć na talerze, polać sosem, posypać posiekaną bazylią lub natką, podawać z tartym parmezanem.",
                R.drawable.kopytka_batat,
            ),
            Recipe(
                "Risotto primavera",
"Jeśli używamy szparagów, należy je opłukać, odłamać (same złamią się we właściwym miejscu), wyrzucić twarde, zdrewniałe końce (są włókniste i nie nadają się do jedzenia). Pozostałą zieloną część szparagów pokroić ukośnie na kawałeczki, zachowując zielone główki w całości.\n" +
        "Jeśli używamy fasolki szparagowej, należy ją pokroić na kawałeczki.\n" +
        "Marchewkę obrać, następnie obieraczką do warzyw \"obierać ją\" robiąc paseczki - tasiemki. Tak samo postąpić z nieobraną cukinią (pomijając środek z pestkami ze środka).\n" +
        "Cebulę pokroić w drobną kosteczkę, czosnek przecisnąć przez praskę, pomidora sparzyć, obrać ze skórki a miąższ pokroić w kosteczkę.\n" +
        "W wysokim garnku roztopić łyżkę masła, dodać połowę cebuli i zeszklić ją mieszając od czasu do czasu nie rumieniąc.\n" +
        "Dodać ryż i smażyć na małym ogniu przez około 1 minutę ciągle mieszając aż cały ryż się podgrzeje. Wlać wino i całkowicie odparować.\n" +
        "Następnie stopniowo (po około 1/2 szklanki) dodawać gorący bulion, mieszając ryż. Dodawać kolejną porcję bulionu dopiero wówczas gdy poprzednia zostanie wchłonięta przez ryż. Gotować w ten sposób risotto przez ok. 17 minut. Na ostatnie 7 minut dodać fasolkę.\n" +
        "W czasie gdy gotuje się ryż, na oddzielnej patelni podsmażyć warzywa: na dużej pateli na 2 łyżkach oliwy zeszklić pokrojoną w kosteczkę cebulę. Następnie dodać marchewkę i dalej smażyć co chwilę mieszając przez ok. 2 minuty. Dodać szparagi i smażyć przez kolejne 2 minuty. Pod koniec dodać czosnek.\n" +
        "Dodać pomidora, doprawić całość solą, pieprzem oraz oregano. Gotować przez około 3 minuty co chwilę mieszając.\n" +
        "Dodać cukinię i gotować przez ok. 2 minuty aż zmięknie.\n" +
        "Gotowe warzywa przełożyć do garnka z ugotowanym, gorącym ryżem. Odstawić z ognia, dodać pozostałą łyżkę masła, 2 łyżki tartego sera, posiekany szczypiorek i bazylię. Całość wymieszać.\n" +
        "Sprawdzić doprawienie solą i pieprzem. Podawać z dodatkowym serem i oliwą wedle uznania.",
                R.drawable.risotto_primavera,
            ),
            Recipe(
                "Warzywne curry",
"Marchewkę obrać i pokroić w słupki. Ziemniaka obrać i pokroić w kostkę. Cukinię pokroić na półplasterki a bakłaża w kostkę.\n" +
        "Cebulę zgrubnie posiekać, papryczki również, pozbywając się wcześniej nasion. Cebulę i papryczki włożyć do pojemnika blendera, dodać 1/3 puszki mleka kokosowego oraz kmin rzymski (i mieloną kurkumę jeśli jej używamy), wszystko zmiksować na pastę.\n" +
        "Do szerokiego dużego garnka włożyć kurkumę świeżą (obraną i startą na drobnej tarce), podgrzewać przez pół minuty. Następnie dodać wszystkie pokrojone warzywa oraz resztę mleka kokosowego. Zagotować pod przykryciem, następnie gotować przez ok. 15 minut pod przykryciem aż warzywa zmiękną, w międzyczasie od czasu do czasu zamieszać.\n" +
        "Wlać zmiksowaną pastę, wymieszać i gotować przez ok. 5 minut.\n" +
        "Na koniec dodać sok z 1 limonki i doprawić całość solą oraz pieprzem.",
                R.drawable.warzywne_curry,
            ),
            Recipe(
                "Chili sin carne",
"Soczewicę opłukać na sitku. Na dużej patelni na oleju zeszklić pokrojoną w kosteczkę cebulę. Dodać soczewicę i mieszając smażyć przez 1 - 2 minuty.\n" +
        "Dodać starty czosnek oraz przyprawy, doprawić solą i pieprzem, znów chwilkę podsmażyć.\n" +
        "Wlać bulion i zagotować. Przykryć i gotować przez ok. 15 minut (pomarańczowa soczewica) lub 30 minut (zielona).\n" +
        "Dodać pokrojone w małą kosteczkę paprykę i suszone pomidory, a następnie odcedzoną i opłukaną fasolę i kukurydzę. Mieszając co chwila gotować przez ok. 2 minuty.\n" +
        "Dodać zmiksowane pomidory z puszki, wymieszać, przykryć i gotować przez ok. 15 minut. Sprawdzić doprawienie solą i pieprzem.\n" +
        "Na koniec dodać koncentrat pomidorowy i mieszając gotować bez przykrycia przez ok. 1 - 2 minuty. Jeszcze gorące posypać tartą mozzarellą.\n" +
        "Można podawać z awokado, limonką, jogurtem oraz świeżą kolendrą i limonką.",
                R.drawable.chili_sin_carne,
            ),
        )
    }
}