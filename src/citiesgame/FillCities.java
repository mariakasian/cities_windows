package citiesgame;

import java.util.Collections;
import java.util.HashSet;

public class FillCities {
    public static HashSet<String> fillCities() {
        HashSet<String> cities = new HashSet<>();
        String[] listOfCities = {"Авдіївка",
                "Алмазна",
                "Алупка",
                "Алушта",
                "Алчевськ",
                "Амвросіївка",
                "Ананьїв",
                "Андрушівка",
                "Антрацит",
                "Апостолове",
                "Армянськ",
                "Арциз",
                "Балаклія",
                "Балта",
                "Бар",
                "Баранівка",
                "Барвінкове",
                "Батурин",
                "Бахмач",
                "Бахмут",
                "Бахчисарай",
                "Баштанка",
                "Белз",
                "Бердичів",
                "Бердянськ",
                "Берегове",
                "Бережани",
                "Березань",
                "Березівка",
                "Березне",
                "Берестечко",
                "Берислав",
                "Бершадь",
                "Бібрка",
                "Біла Церква",
                "Білгород-Дністровський",
                "Білицьке",
                "Білогірськ",
                "Білозерське",
                "Білопілля",
                "Біляївка",
                "Благовіщенське",
                "Бобринець",
                "Бобровиця",
                "Богодухів",
                "Богуслав",
                "Боково-Хрустальне",
                "Болград",
                "Болехів",
                "Борзна",
                "Борислав",
                "Бориспіль",
                "Борщів",
                "Боярка",
                "Бровари",
                "Броди",
                "Брянка",
                "Бунге",
                "Буринь",
                "Бурштин",
                "Буськ",
                "Буча",
                "Бучач",
                "Валки",
                "Вараш",
                "Василівка",
                "Васильків",
                "Ватутіне",
                "Вашківці",
                "Великі Мости",
                "Верхівцеве",
                "Верхньодніпровськ",
                "Вижниця",
                "Вилкове",
                "Винники",
                "Виноградів",
                "Вишгород",
                "Вишневе",
                "Вільногірськ",
                "Вільнянськ",
                "Вінниця",
                "Вовчанськ",
                "Вознесенівка",
                "Вознесенськ",
                "Волноваха",
                "Володимир",
                "Волочиськ",
                "Ворожба",
                "Вуглегірськ",
                "Вугледар",
                "Гадяч",
                "Гайворон",
                "Гайсин",
                "Галич",
                "Генічеськ",
                "Герца",
                "Гірник",
                "Гірське",
                "Глиняни",
                "Глобине",
                "Глухів",
                "Гнівань",
                "Гола Пристань",
                "Голубівка",
                "Горішні Плавні",
                "Горлівка",
                "Городенка",
                "Городище",
                "Городня",
                "Городок",
                "Горохів",
                "Гребінка",
                "Гуляйполе",
                "Дебальцеве",
                "Деражня",
                "Дергачі",
                "Джанкой",
                "Дніпро",
                "Дніпрорудне",
                "Добромиль",
                "Добропілля",
                "Довжанськ",
                "Докучаєвськ",
                "Долина",
                "Долинська",
                "Донецьк",
                "Дрогобич",
                "Дружба",
                "Дружківка",
                "Дубляни",
                "Дубно",
                "Дубровиця",
                "Дунаївці",
                "Евпатория",
                "Елеваторне",
                "Еленовка",
                "Елизаветово",
                "Емельяновка",
                "Енергетиків",
                "Ермаково",
                "Есень",
                "Егорово",
                "Елеваторне",
                "Еленовка",
                "Елітне",
                "Енгельсове",
                "Енергодар",
                "Ерофеево",
                "Есхар",
                "Євпаторія",
                "Єнакієве",
                "Жашків",
                "Жданівка",
                "Жидачів",
                "Житомир",
                "Жмеринка",
                "Жовква",
                "Жовті Води",
                "Заводське",
                "Залізне",
                "Заліщики",
                "Запоріжжя",
                "Заставна",
                "Збараж",
                "Зборів",
                "Звенигородка",
                "Звягель",
                "Здолбунів",
                "Зеленодольськ",
                "Зимогір'я",
                "Зіньків",
                "Зміїв",
                "Знам'янка",
                "Золоте",
                "Золотоноша",
                "Золочів",
                "Зоринськ",
                "Зугрес",
                "Івано-Франківськ",
                "Ізмаїл",
                "Ізюм",
                "Ізяслав",
                "Іллінці",
                "Іловайськ",
                "Інкерман",
                "Ірміно",
                "Ірпінь",
                "Іршава",
                "Ічня",
                "Кагарлик",
                "Кадіївка",
                "Калинівка",
                "Калуш",
                "Кальміуське",
                "Камінь-Каширський",
                "Кам'янець-Подільський",
                "Кам'янка",
                "Кам'янка-Бузька",
                "Кам'янка-Дніпровська",
                "Кам'янське",
                "Канів",
                "Карлівка",
                "Каховка",
                "Керч",
                "Київ",
                "Кипуче",
                "Ківерці",
                "Кілія",
                "Кіцмань",
                "Кобеляки",
                "Ковель",
                "Кодима",
                "Козятин",
                "Коломия",
                "Комарно",
                "Конотоп",
                "Копичинці",
                "Корець",
                "Коростень",
                "Коростишів",
                "Корсунь-Шевченківський",
                "Корюківка",
                "Косів",
                "Костопіль",
                "Костянтинівка",
                "Краматорськ",
                "Красилів",
                "Красногорівка",
                "Красноград",
                "Красноперекопськ",
                "Кременець",
                "Кременчук",
                "Кремінна",
                "Кривий Ріг",
                "Кролевець",
                "Кропивницький",
                "Куп'янськ",
                "Курахове",
                "Ладижин",
                "Ланівці",
                "Лебедин",
                "Лиман",
                "Липовець",
                "Лисичанськ",
                "Лозова",
                "Лохвиця",
                "Лубни",
                "Луганськ",
                "Лутугине",
                "Луцьк",
                "Львів",
                "Любомль",
                "Люботин",
                "Макіївка",
                "Мала Виска",
                "Малин",
                "Марганець",
                "Маріуполь",
                "Мар'їнка",
                "Мелітополь",
                "Мена",
                "Мерефа",
                "Миколаїв",
                "Миколаїв",
                "Миколаївка",
                "Миргород",
                "Мирноград",
                "Миронівка",
                "Міусинськ",
                "Могилів-Подільський",
                "Молодогвардійськ",
                "Молочанськ",
                "Монастириська",
                "Монастирище",
                "Моршин",
                "Моспине",
                "Мостиська",
                "Мукачево",
                "Надвірна",
                "Немирів",
                "Нетішин",
                "Ніжин",
                "Нікополь",
                "Нова Каховка",
                "Нова Одеса",
                "Новгород-Сіверський",
                "Новий Буг",
                "Новий Калинів",
                "Новий Розділ",
                "Новоазовськ",
                "Нововолинськ",
                "Новогродівка",
                "Новодністровськ",
                "Новодружеськ",
                "Новомиргород",
                "Новомосковськ",
                "Новоселиця",
                "Новоукраїнка",
                "Новояворівськ",
                "Носівка",
                "Обухів",
                "Овруч",
                "Одеса",
                "Олевськ",
                "Олександрівськ",
                "Олександрія",
                "Олешки",
                "Оріхів",
                "Остер",
                "Острог",
                "Охтирка",
                "Очаків",
                "Павлоград",
                "Первомайськ",
                "Первомайськ",
                "Первомайський",
                "Перевальськ",
                "Перемишляни",
                "Перечин",
                "Перещепине",
                "Переяслав",
                "Першотравенськ",
                "Петрово-Красносілля",
                "Пирятин",
                "Південне",
                "Підгайці",
                "Підгородне",
                "Погребище",
                "Подільськ",
                "Покров",
                "Покровськ",
                "Пологи",
                "Полонне",
                "Полтава",
                "Помічна",
                "Попасна",
                "Почаїв",
                "Привілля",
                "Прилуки",
                "Приморськ",
                "Прип'ять",
                "Пустомити",
                "Путивль",
                "П'ятихатки",
                "Рава-Руська",
                "Радехів",
                "Радивилів",
                "Радомишль",
                "Рахів",
                "Рені",
                "Решетилівка",
                "Ржищів",
                "Рівне",
                "Ровеньки",
                "Рогатин",
                "Родинське",
                "Рожище",
                "Роздільна",
                "Ромни",
                "Рубіжне",
                "Рудки",
                "Саки",
                "Самбір",
                "Сарни",
                "Свалява",
                "Сватове",
                "Світловодськ",
                "Світлодарськ",
                "Святогірськ",
                "Севастополь",
                "Селидове",
                "Семенівка",
                "Середина-Буда",
                "Сєвєродонецьк",
                "Синельникове",
                "Сіверськ",
                "Сімферополь",
                "Скадовськ",
                "Скалат",
                "Сквира",
                "Сколе",
                "Славута",
                "Славутич",
                "Слов'янськ",
                "Сміла",
                "Снігурівка",
                "Сніжне",
                "Сновськ",
                "Снятин",
                "Сокаль",
                "Сокиряни",
                "Соледар",
                "Сорокине",
                "Соснівка",
                "Старий Крим",
                "Старий Самбір",
                "Старобільськ",
                "Старокостянтинів",
                "Стебник",
                "Сторожинець",
                "Стрий",
                "Судак",
                "Судова Вишня",
                "Суми",
                "Суходільськ",
                "Таврійськ",
                "Тальне",
                "Тараща",
                "Татарбунари",
                "Теплодар",
                "Теребовля",
                "Тернівка",
                "Тернопіль",
                "Тетіїв",
                "Тисмениця",
                "Тлумач",
                "Токмак",
                "Торецьк",
                "Тростянець",
                "Трускавець",
                "Тульчин",
                "Турка",
                "Тячів",
                "Угнів",
                "Ужгород",
                "Узин",
                "Українка",
                "Українськ",
                "Умань",
                "Устилуг",
                "Фастів",
                "Феодосія",
                "Харків",
                "Харцизьк",
                "Херсон",
                "Хирів",
                "Хмельницький",
                "Хмільник",
                "Ходорів",
                "Хорол",
                "Хоростків",
                "Хотин",
                "Хрестівка",
                "Христинівка",
                "Хрустальний",
                "Хуст",
                "Часів Яр",
                "Червоноград",
                "Черкаси",
                "Чернівці",
                "Чернігів",
                "Чигирин",
                "Чистякове",
                "Чоп",
                "Чорнобиль",
                "Чорноморськ",
                "Чортків",
                "Чугуїв",
                "Чуднів",
                "Шаргород",
                "Шахтарськ",
                "Шепетівка",
                "Шостка",
                "Шпола",
                "Шумськ",
                "Щастя",
                "Щолкіне",
                "Южне",
                "Южноукраїнськ",
                "Яворів",
                "Яготин",
                "Ялта",
                "Ямпіль",
                "Яремче",
                "Ясинувата"

        };
        Collections.addAll(cities, listOfCities);
        return cities;
    }
}

