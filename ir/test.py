from dictionary import Dictionary
from parser import parse_text, count_occurence

text = """
2021 Kaohsiung tower fire

In the early morning hours of 14 October 2021, at 02:54 NST (UTC+8), a fire broke out in a 13-floor building in the Yancheng District of Kaohsiung in southwestern Taiwan. At least 46 people died and 41 others were injured. The fire was extinguished after about four and a half hours. The cause of the fire is currently under investigation, though piles of debris left around the building may have complicated rescues and helped fuel the fire.

It was the deadliest fire ever in the city, and the deadliest building fire in Taiwan since 1995, when a karaoke bar in Taichung in central Taiwan caught on fire, killing 64 people.[2][3]
The Chengzhongcheng Building is a 13-floor commercial and residential building, one of many apartment buildings in the Yancheng District, an older section of Kaohsiung.[4][1][5][6] Mayor Chen Chi-mai stated that the building had previously housed a cinema, as well as restaurants and karaoke lounges, but was partially abandoned at the time of the fire.[4] Officials also stated that the building was 40 years old, and that a few shops were located in the lower levels.[7] Two underground floors were not being used, and the first to fifth floors were abandoned.[8]

About 120 households lived between the seventh and eleventh floors.[8] Fire chief Lee Ching-hsiu stated that most of the residents were elderly and either suffering from physical ailments or dementia.[8] The apartments were as small as 13 m2 (140 sq ft), and many residents lived alone.[5]

The tower had suffered another fire earlier in its lifetime, in 1999.[9][10] This earlier fire had occurred during daylight hours, and firefighters were able to rescue 28 people that were trapped in the building, resulting in no deaths.[9][10]

Locals called the tower "Kaohsiung's No. 1 ghost building".[1] Fire extinguishers had only been installed the month prior, with only three per floor due to lack of funds.[5]

The city's fire department stated that the fire was first reported at 02:54 NST (UTC+8).[1] It is believed by authorities that the fire first broke out in the ground floor of the building at a tea-shop.[5] A survivor stated she opened her door and saw black smoke everywhere, and other residents stated they heard a loud bang similar to an explosion before the fire.[11]

Some 159 firefighters responded to the fire with 75 fire vehicles.[1] Chief Lee stated that because the lower floors had high ceilings and a front made of glass, the fire rose up rapidly, eventually reaching up to the 6th floor, and filling the floors above with smoke.[8][2] By midday at least 62 people had been evacuated from the building, aged between 8 and 83 years-old.[12] Lee reported that the fire had been extinguished by 07:17 NST.[8] More than 377 rescue workers were deployed to the scene and the rescue is ongoing.[13]

While the cause of the fire was not reported immediately, the large amount of debris and clutter in the building reportedly helped spread the fire and add to its intensity.[14] The debris and clutter also impeded the search and rescue and evacuation efforts as many points of access were blocked.[5] Hours after the fire, smoke could still be seen, and the sound of glass breaking was heard around the building.[6]

A total of 46 people died and a further 41 were injured.[8] The fire bureau noted that the average age of the deceased was 62.[2]

Initially only 7 people were reported dead by authorities, but the number grew throughout the night.[12] Thirty-two people were declared deceased at the scene of the fire and sent directly to the morgue, with an additional 14 sent to the hospital with no signs of life to be declared dead at the hospital.[15][16]

According to Chief Lee, the number of casualties was expected to rise, as some victims were still believed to be trapped between the 7th and 11th floors.[12] Lee also noted that most of the casualties were caused by smoke inhalation, and added that one reason why the casualty count was so high was because the fire happened during the early morning hours, while people were still asleep.[12][8][2]

Mayor Chen Chi-mai at the scene
Taiwanese President Tsai Ing-wen asked authorities to help relocate those affected.[7] Authorities have also ordered an investigation to determine the cause of the fire, and have not ruled out the possibility of arson.[4] The police have summoned four witnesses for the investigation.[8] Kaohsiung city councilors called for fire safety to be improved throughout the city, including investigations of old buildings, amending safety standards, and equipment and infrastructure upgrades.[17]
"""

terms = parse_text(text)
print(count_occurence(terms))