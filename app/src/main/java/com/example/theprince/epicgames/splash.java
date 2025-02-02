package com.example.theprince.epicgames;

import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {
    ImageView img,logo;
    MediaPlayer mediaPlayer;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        img = findViewById(R.id.img);
        ProgressBar pg = findViewById(R.id.PG);
        Animation an = AnimationUtils.loadAnimation(this,R.anim.fide_in);
        img.setAnimation(an);

        mediaPlayer = MediaPlayer.create(this,R.raw.sound);

        logo = findViewById(R.id.logo);
        an = AnimationUtils.loadAnimation(this,R.anim.logo);
        logo.setAnimation(an);

        ////This Code (When You Signin And Close App Then Open again ,This Open RecyclerView Format)////
        DataBase db = new DataBase(splash.this);
        Cursor cc = db.getSpecifiedRow_users("1");
        if (cc.getCount() != 0)
            intent = new Intent(getApplicationContext(),Recycled_View.class);
        else
            intent = new Intent(getApplicationContext(),login.class);

        pg.setVisibility(View.VISIBLE);
        mediaPlayer.start();
        Thread thread = new Thread(){
            @Override
            public void run()
            {
                try {
                    sleep(4000);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();


        //database_games();
    }

    public void database_games(){
        DataBase1 db1 = new DataBase1(this);
        db1.onUpgrade(db1.getWritableDatabase(),1,2);
        db1.insertData_Games("Fifa 18","https://www.youtube.com/watch?v=0ETKAYRzvjs",R.drawable.fifa18_1,R.drawable.fifa18_2,R.drawable.fifa18_3,"Powered by Frostbite, FIFA 18 blurs the line between the virtual and real worlds, bringing to life the players, teams and atmospheres of The World’s Game. Move with Real Player Motion Technology – an all-new animation system that creates a new level of responsiveness and player personality – to unlock dramatic moments in the world’s most immersive atmospheres. Then go on a global journey as Alex Hunter along with a star-studded cast of characters, including Cristiano Ronaldo and other European football stars.\n" +
                "The all-new, game-changing animation system utilizes pose trajectory matching on every frame to deliver the franchise’s most responsive and fluid gameplay ever. New motion capture techniques and frame by frame animation transitions ensure gameplay accurately represents the reality of football.","Features of FIFA 18\n" +
                "Following are the main features of FIFA 18 that you will be able to experience after the first install on your Operating System.\n" +
                "FIFA 18 introduces an all-new animation system that unlocks a new level of responsiveness and player personality.\n" +
                "The whole world is talking about Alex Hunter. Now he’s back for a second season, and rumor has it, he’s on the move…\n" +
                "Iconic football legends, six new character archetypes, new player positioning and more combine to immerse you in The World’s Game.\n" +
                "The best of the best are coming to FIFA 18. Play with the most iconic legends of football including Ronaldo Naz?rio, Diego Maradona and Thierry Henry. More ICONS and FUT features to be revealed throughout the summer of 2017.\n" +
                "Got high resolution textures.\n" +
                "Bundles some of the most staggering modifications.\n" +
                "Got awesome visuals.","System Requirements of FIFA 18\n" +
                "Before you start FIFA 18 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel i3 6300T or equivalent benchmark (5,199) – Intel i3 4340 (5,226), and Intel i3 4350 (5,302) as alternatives.\n" +
                "RAM: 8GB\n" +
                "Setup Size: 30.8GB\n" +
                "Hard Disk Space: 50GB");

        db1.insertData_Games("Pes 18" ,"https://www.youtube.com/watch?v=2WfnQpRPUD0",R.drawable.pes_1,R.drawable.pes_2,R.drawable.pes_3,"‘Where Legends Are Made’ encapsulates the return of PES, with an unparalleled gameplay experience.\n" +
                "PRO EVOLUTION SOCCER 2018 – FC Barcelona Edition Bundle[PREMIUM EDITION]A special edition version dedicated to FC Barcelona and PES fans! Get exclusive content for myClub associated with the club! • 1x FCB Special Agent• 1x FCB Legend Special Agent• 1,000 myClub coins+ bonus myClub content:• 4x Start Up Agents• 1x Partner Club Agent• 10,000 GP x 10 weeks","Features of Pro Evolution Soccer 2018\n" +
                "Following are the main features of Pro Evolution Soccer 2018 that you will be able to experience after the first install on your Operating System.\n" +
                "Gameplay Masterclass – Strategic Dribbling, Real Touch+ and new set pieces take the unrivalled gameplay to the next level\n" +
                "Presentation Overhaul – New menus and real player images\n" +
                "PES League Integration – Compete with PES League in new modes including myClub\n" +
                "Online Co-op -A mode dedicated to co-op play is newly added\n" +
                "Random Selection Match – Fan favourite returns with new presentation and features\n" +
                "Master League Upgrade – New pre-season tournaments, improved transfer system, presentations and functionality\n" +
                "Enhanced Visual Reality – New lighting, reworked player models and animations covering everything from facial expressions to body movement to bring the game to life","System Requirements of Pro Evolution Soccer 2018\n" +
                "Before you start Pro Evolution Soccer 2018 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i5-3450(3.10GHz)/AMD FX 4100(3.60GHz)\n" +
                "RAM: 8GB\n" +
                "Setup Size: 24.6GB\n" +
                "Hard Disk Space: 30GB");

        db1.insertData_Games("WWE 2K18","https://www.youtube.com/watch?v=7ZbZfsuLXtg" ,R.drawable.wwe_2,R.drawable.wwe_3,R.drawable.wwe_4,"The biggest video game franchise in WWE history is back with WWE 2K18! Featuring cover Superstar Seth Rollins, WWE 2K18 promises to bring you closer to the ring than ever before with hard-hitting action, stunning graphics, drama, excitement, new game modes, additional match types, deep creation capabilities, and everything you’ve come to love from WWE 2K. Be Like No One.\n" +
                "The most realistic WWE video game experience just became more intense with the addition of eight man matches, a new grapple carry system, new weight detection, thousands of new animations and a massive backstage area. A brand-new rendering engine also gives WWE 2K18 a visual overhaul and will bring the drama of WWE to life like never before!","Features of WWE 2K18\n" +
                "Following are the main features of WWE 2K18 that you will be able to experience after the first install on your Operating System.\n" +
                "Imposing action game.\n" +
                "Latest Sports Fighting Game\n" +
                "Got an iconic gameplay which the series is famous for.\n" +
                "Got a new chapter.\n" +
                "Got stunning visuals.","System Requirements of WWE 2K18\n" +
                "Before you start WWE 2K18 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows 7/8/8.1/10\n" +
                "CPU:  Intel Core i5-3550 / AMD FX 8150\n" +
                "RAM: 4 GB\n" +
                "Setup Size: 40.3 GB\n" +
                "At least 2 GB DDR Video Memory\n" +
                "Hard Disk Space: 50 GB\n");

        db1.insertData_Games("F1 2017","https://www.youtube.com/watch?v=OwFTFRKaB60",R.drawable.f1_1,R.drawable.f1_2,R.drawable.f1_3,"Win the 2017 World Championship, break every record in the fastest ever F1 cars, and race some of the most iconic F1 cars of the last 30 years. With an even deeper ten year Career, more varied gameplay in the new ‘Championships’ mode, and a host of other new features, both online and offline, F1 2017 is the most complete and thrilling F1 videogame ever.\n" +
                "F1 2017 gives the player unprecedented access to not only the on-track excitement of F1, but also the off-track dealings and vehicle development that goes along with it. The acclaimed career mode is updated to include additional practice programmes to help the driver hone their skills, an expanded Research and Development tree to provide greater depth and control over the development of the car, and the ability to manage engines and gearboxes over the course of the season.","Features of F1 2017 Update V1.11 Free Download\n" +
                "Following are the main features of F1 2017 Update V1.11 Free Download that you will be able to experience after the first install on your Operating System.\n" +
                "The expanded career mode allows players to make history as they hone their skills and develop their car over multiple seasons. Delve deeper than ever before into the new vehicle management features that require the player to balance resource to improve performance, keep the car reliable, and avoid punishing grid penalties.\n" +
                "Manage the six key components which each make up a modern F1 power unit and work to develop team skills such as pit stop times, Research and Development speed and new part reliability.\n" +
                "There are also new Practice Programmes to master and earn resource points from, ‘Fuel Management’ and ‘Race Pace’, and stunning new and updated career locations form the immersive back drop to the off-track negotiations. The classic cars also take centre stage in the enhanced career mode as you are invited to race them in the new ‘invitational events’.\n" +
                "Got high resolution textures.\n" +
                "Bundles some of the most staggering modifications."+
                "Got awesome visuals.","System Requirements of F1 2017 Update V1.11 Free Download\n" +
                "Before you order F1 2017 make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i3 530 or AMD FX 4100\n" +
                "RAM: 8GB\n" +
                "Setup Size: 14.8GB\n" +
                "Hard Disk Space: 20GB\n");

        db1.insertData_Games("FootBall Manger 17","https://www.youtube.com/watch?v=6Po_RCUIJ3g",R.drawable.foot_1,R.drawable.foot_2,R.drawable.foot_3,"Take control of your favourite football team in Football Manager 2017, the most realistic and immersive football management game to date. It’s the closest thing to doing the job for real!\n" +
                "With over 2,500 real clubs to manage and over 500,000 real footballers and staff to sign, Football Manager 2017 elevates you into a living, breathing world of football management with you at the centre.","Features of Football Manager 2017\n" +
                "Following are the main features of Football Manager 2017 that you will be able to experience after the first install on your Operating System.\n" +
                "You’ll have full control of transfers and decide who plays, and who sits on the bench.\n" +
                "You’re in complete control of tactics, team-talks and pitch-side instructions, and you’ll follow the match live with our acclaimed 3D match engine.\n" +
                "You’ll also deal with real football media, solve player-happiness problems and the board will watch your every move.\n" +
                "Got high resolution textures.\n" +
                "Got awesome visuals.","System Requirements of Football Manager 2017\n" +
                "Before you start Football Manager 2017 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Pentium 4, Intel Core or AMD Athlon – 2.2 GHz +\n" +
                "RAM: 2GB\n" +
                "Setup Size: 3.8GB\n" +
                "Hard Disk Space: 4GB");

        db1.insertData_Games("Tennis World Tour","https://www.youtube.com/watch?v=M-NMZOAu3-8",R.drawable.tennis_1,R.drawable.tennis_2,R.drawable.tennis_3,"Play as one of the 30 best tennis players in the world: Roger Federer, Angelique Kerber, Stan Wawrinka and many of the sport’s legends.\n" +
                "Realistic animations, carefully reproduced in the game using motion capture technology, help you learn all of the shots used in modern tennis: the slice, lob, top spin, etc.","Features of Tennis World Tour\n" +
                "Following are the main features of Tennis World Tour that you will be able to experience after the first install on your Operating System.\n" +
                "18 types of courts: hard, clay, grass, carpet and even hardwood. Each surface affects the playing conditions.\n" +
                "Create your player and experience a career worthy of a professional: training, tournaments, staff management, equipment purchases, etc.\n" +
                "Decide what strategy to adopt for each match and use your skill cards to defeat your opponents.\n" +
                "Add a standalone entry to your library.\n" +
                "Got high resolution textures.\n" +
                "Got awesome visuals.","System Requirements of Tennis World Tour\n" +
                "Before you order Tennis World Tour make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i5-750 / AMD Phenom II X4 940\n" +
                "RAM: 4GB\n" +
                "Setup Size: 6.3GB\n" +
                "Hard Disk Space: 8GB");

        db1.insertData_Games("Assassins Creed III","https://www.youtube.com/watch?v=-pUhraVG7Ow",R.drawable.assassins_1,R.drawable.assassins_2,R.drawable.assassins_3,"Assassin’s Creed 3 Overview\n" +
                "Assassin’s Creed III is an action adventure game which is developed under the banner of Ubisoft Montreal for Microsoft Windows and other playing consoles. It was released on 20th November 2012 and Ubisoft published this game. It is the fifth major game in the Assassin’s Creed series and a sequel to the 2011 Assassin’s Creed Revelations.\n" +
                "Assassin’s Creed III game is set in the era of American Revolution. In this game you will see assassins fighting for justice and for their motto of Peace through Free will. They will have to fight against the Templars who think peace can come through power and control. In this game the series protagonist Desmond Miles uses the machine Animus and relives the past of his ancestors. He tries to change the past in order to prevent the 2012 apocalypse of the world. In Assassin’s Creed III, the hero will be Connor who is a half Mohawk and half English by birth. This story is set in the era of 18th century when British colonization was on top. Connor will have to use his assassin abilities to take out the mainstream people in order to get freedom. You can also download Assassins Creed Unity.","Features of Assassins Creed III\n" +
                "Following are the main features of Assassins Creed III that you will be able to experience after the first install on your Operating System.\n" +
                "Imposing action and adventure game.\n" +
                "Set in an era of American Revolution.\n" +
                "Third person perspective game.\n" +
                "Many side missions included.\n" +
                "Multiplayer mode added.\n" +
                "Gripping story.\n" +
                "Awesome action techniques.\n" +
                "Impressive graphics.\n" +
                "Can run and climb freely.\n" +
                "Lots of weapons at your disposal.","System Requirements of Assassins Creed III\n" +
                "Before you start Assassins Creed III  make sure your PC meets minimum system requirements.\n" +
                "Operating System: Windows Vista/7/8/8.1\n" +
                "CPU: 2.66GHz Intel Core 2 Duo or later.\n" +
                "RAM: 2GB\n" +
                "Hard Disk Space: 17GB\n");

        db1.insertData_Games("Battle Field 4","https://www.youtube.com/watch?v=sclTMEd7JN8",R.drawable.battle_field_1,R.drawable.battle_field_2,R.drawable.battle_field_3,"Battlefield 4 Overview\n" +
                "Welcome to Battlefield 4 is an impressive first person shooting game. This game was developed by EA DICE for Microsoft Windows and publish under the banner of Electronic Arts. It was release on 20 October 2013. Amazing features have been loaded in this game. You may also like to download Napoleon Total War.\n" +
                "Now we are presenting the world best first person shooting game and it is very easy to play with many features from the previous installment. In this game multi players Mode, single players Mode, campaign Mode, modification and additions as well as are included. It is also ability to in this for the color blind people that they can change the on screen indicators and dual-scoped weapons are also available that divide into automatic and semi-automatic fire. The stunning graphic make this game more beautiful and gorgeous. The downloading method is quite simple. All in all this game is very interesting and you will surely feel pleasure after to play.You can also download Star Wars Empire At War.","Features of Battlefield 4\n" +
                "Following are the main features of Battlefield 4 Download Free that you will be able to experience after the first install on your operating System.\n" +
                "It’s an impressive game for game lovers.\n" +
                "First person shooting game.\n" +
                "Amazing game play.\n" +
                "Can play in single, multi players and Compaign mode.\n" +
                "Color blind people can change the on screen indicators.\n" +
                "Dual-scoped weapons are include.\n" +
                "Weapons are divided into automatic and semi-automatic fire.\n" +
                "The downloading is very simple and unique.\n" +
                "Impressive graphic to make game more gorgeous.\n" +
                "Give a realistic feel after to play.","System Requirement Of Battlefield 4\n" +
                "Before you start Battlefield 4 Download Free make sure your PC meets minimums system requirements.\n" +
                "Operating System: Window Vista/7/8\n" +
                "CPU: Intel Core 2 Duo or later\n" +
                "RAM: 4 GB\n" +
                "Setup Size: 18.2GB\n" +
                "Hard Disk Space: 30 GB");

        db1.insertData_Games("Far Cry 4","https://www.youtube.com/watch?v=xI6uV47jKME",R.drawable.far_cry_1,R.drawable.far_cry_2,R.drawable.far_cry_3,"Far Cry 4 PC Game is developed by Ubisoft Montreal and published by Ubisoft. This is a single player game and fourth version from Far Cry game series. It based on a very interesting story. The main role will be played by Ajay. Who is a young man from Nepal. The story is that the person of Nepal will come to an area to find his dead mother ashes. But he get caught up in other fight of civilians. Then player has to fight. He has to reach at the end by completing various missions in the game. One important thing in this game can have multiple endings i.e. There is no one ending of this game. Endings depends on the the player that how he plays the game and which missions and levels he successfully completes. Some new and latest weapons have also been introduced. Which will be helpful to the player. Enemies can also be customized via AI system. If you like playing action games then you may like similar game Far Cry 2. Download it free from our website.\n" +
                "Graphics and animations used in Far Cry 4 have very much improved. In this game sounds of the characters and background sounds have been reduced in order to keep the overall background atmosphere calm. So the player shall enjoy the game more as compared to the previous series. Maps have also been used and its size are more or less similar to the previous version game. The game contains more natural views where a lot of forests, trees and mountainous regions have been shown in this version. You may also like playing similar game called Far Cry 3 Blood Dragon which can be downloaded free from our site. Far Cry 3 is also uploaded in our site which is the Previous part of this game.","Features of Far Cry 4 PC Game 2014\n" +
                "Following are the main features of Far Cry 4  PC Game that you will be able to experience after the first install on your Operating System.\n" +
                "Improved Graphics and visual effects\n" +
                "Action and Adventure game\n" +
                "Single player game\n" +
                "Powerful Artificial Intelligence system\n" +
                "Latest heavy weapons introduced in the game.","System Requirements of Far Cry 4 PC Game\n" +
                "Before you start Far Cry 4  make sure your PC meets minimum system requirements\n" +
                "Operating System: Windows 7/ Windows 8 and 8.1 ( 64 Bit only )\n" +
                "CPU: Core i5 2.66 GHz\n" +
                "RAM: 4 GB\n" +
                "Hard disk Space: 30 GB");

        db1.insertData_Games("Rise Of The Tomb Raider","https://www.youtube.com/watch?v=zmk-frY9qKU",R.drawable.tomp_rider_1,R.drawable.tomp_rider_2,R.drawable.tomp_rider_3,"Rise of the Tomb Raider is developed by Crystal Dynamics and is published under the banner of Square Enix. This game was released on 28th January, 2016. You can also download Tomb Raider 2.\n" +
                "In this version of Rise Of The Tomb Raider PC game you will be playing as Lara who is going to explore one of the most deceitful and remote regions of Siberia where she will be on a mission to discover the secret of immortality. During her adventure she will be facing the brutal organization known as Trinity. Lara must form a new alliance and at the end of the day has to become the Tomb Raider. This game features awesome guerrilla fights in some awe-inspiring sights. IN this game Lara won’t be just a survivor but will be trying her hands on Tomb Raider expedition. The game has got awesome graphics and the sounds effects are also quite mesmerizing. You can also download Tomb Raider Legends.","Features of Rise Of The Tomb Raider\n" +
                "Following are the main features of Rise Of The Tomb Raider that you will be able to experience after the first install on your Operating System.\n" +
                "Impressive action and adventure game.\n" +
                "Play as Lara and explore one of the most deceitful regions.\n" +
                "Discover the secret of immortality.\n" +
                "Face the brutal organization known as Trinity.\n" +
                "Form a new alliance and become tomb raider.\n" +
                "Got awesome graphics.\n","\n" +
                "System Requirements of Rise Of The Tomb Raider PC Game 2016\n" +
                "Before you start Rise Of The Tomb Raider  make sure your PC meets minimum system requirements.\n" +
                "Operating System: Tested on Windows 7 64 Bit\n" +
                "Setup Size : 18.4 GB\n" +
                "CPU: Intel Core i3 or later.\n" +
                "RAM: 6 GB\n" +
                "Hard Disk Space: 25 GB");

        db1.insertData_Games("Call of Duty Black Ops","https://www.youtube.com/watch?v=Gi7pWCA_3Cg",R.drawable.call_of_duty_1,R.drawable.call_of_duty_2,R.drawable.call_of_duty_3,"Call of Duty Black Ops Overview\n" +
                "The famous series of Call of Duty comes with a new game. Call of Duty Black Ops 1. It is also developed by Treyarch and was published through Activision. It was released on 9 November 2010. You can also Download Call of Duty Advanced Warfare which is latest release in series.\n" +
                "It is 7Th game in the famous shooting game series. And it is also the first of its kind in this series as it is based on Cold War. It has got the same game play as it predecessor games had. You are controlling a soldier who can use many weapons and throw grenades in the battle field. The player can move by three different positions Standing, Crouching and prone. Each of these positions has different effects on the accuracy and movement of the player.","Features of Call of Duty Black Ops 1\n" +
                "Following are the main features of Call of Duty: Black Ops.\n" +
                "Action Shooting game.\n" +
                "With lots of new missions.\n" +
                "Based on Cold War.\n" +
                "New weapons.\n" +
                "Brief Surroundings with amazing sound effects.\n" +
                "Multi player mode.\n" +
                "Zombie game mode.","System Requirements of Call of Duty Black Ops\n" +
                "Below are the minimum system requirements of Call of Duty Black Ops 1.\n" +
                "Operating System: Windows XP/ Windows Vista/ Windows 7/ Windows 8 and 8.1\n" +
                "CPU: Intel Core 2 Duo 2.66 GHz\n" +
                "RAM: 2GB\n" +
                "Hard disk Space: 12GB");

        db1.insertData_Games("Max Payne 3","https://www.youtube.com/watch?v=rqjOXR9QnMo",R.drawable.max_payne_1,R.drawable.max_payne_2,R.drawable.max_payne_3,"Max Payne 3 Overview\n" +
                "This game is published by Rockstar Games. Max Payne 3 has stunning sound and graphic effects. Max Payne 3 is the third game in the Max Payne series. Max Payne is the main character of this game. He was detector at times. Somebody has killed his wife and daughter badly. Max Payne is in the mission to take revenge from that person. Enemies of Max Payne are very powerful so he has to play with a plan to take revenge from them.\n" +
                "Run and gun style of Max Payne 3 PC game is same as other previous Max Payne 1 game. In this game Last Stand mechanic is introduced. and with the help of this player can play even after loosing all his health. Player can shoot at 360 degrees that is an amazing thing in that game. Animation of this game is very high class. Killing and shooting in this game has got a sense of reality.","Max Payne 3 Features\n" +
                "A third person shooter video game.\n" +
                "Published by Rockstar Games.\n" +
                "Stunning sound and graphic effects.\n" +
                "Third game in the Max Payne series.\n" +
                "Max Payne is the main character of this game.\n" +
                "Mission of taking revenge.\n" +
                "Last Stand mechanic is introduced.\n" +
                "Player can shoot at 360 degrees\n" +
                "Animation of this game is very high class.\n" +
                "Killing and shooting in this game has got a sense of reality.\n" +
                "The locations of this game are very amazing.\n" +
                "16 players can play online in multiplayer mode.","Max Payne 3 System Requirements\n" +
                "Minimum system requirements for this game are given below.\n" +
                "Operating System:  Windows 7, Windows Vista, Windows 8 and 8.1\n" +
                "CPU: Dual Core 2.4 GHz\n" +
                "RAM: 2 GB\n" +
                "Hard Disk: 35 GB");

        db1.insertData_Games("Resident Evil 6","https://www.youtube.com/watch?v=sS_bGpe9qE8",R.drawable.resident_evil_1,R.drawable.resident_evil_2,R.drawable.resident_evil_3,"Resident Evil 6 Overview\n" +
                "Player will also experience dramatic horror in this game. Resident Evil 6 is published by Capcom. You might have played other games of Resident Evil series but this game is something special. Graphic and sound effects are improved. Resident Evil 6 is a 9th game of Resident Evil game series.\n" +
                "In this game player have 4 different plots. Each has its own amazing story line. This game has Mercenaries and Agent hunt mode in which player has to fight against powerful enemies. Player can pick and choose weapons while playing the game. So player has to be quick for playing that game. Tablets are available in this game for player. By taking these tablets player can regenerate his health.","Resident Evil 6 Features\n" +
                "Action adventure and third person shooter video game.\n" +
                "Some horror elements.\n" +
                "Published by Capcom.\n" +
                "Graphic and sound effects are improved.\n" +
                "9th game of Resident Evil game series.\n" +
                "4 different plots.\n" +
                "Each plot has different story line.\n" +
                "Mercenaries and Agent hunt mode\n" +
                "Variety of weapons.\n" +
                "Weapons can be upgraded.\n" +
                "Useful tablets are available.\n" +
                "Check point system is available.\n" +
                "J’avo and zombies are the enemies.\n" +
                "Player can also take skill points.\n" +
                "Co-operative mode is available.","Resident Evil 6 System Requirements\n" +
                "Minimum system requirements for this game are given below.\n" +
                "Operating System: Windows Vista/XP, Windows 7, Windows 8 and 8.1\n" +
                "CPU: Core 2 Duo 2.4 Ghz\n" +
                "RAM: 2 GB\n" +
                "Hard Disk: 16 GB");

        db1.insertData_Games("Sniper Elite 4","https://www.youtube.com/watch?v=lGBRAEvXZ94",R.drawable.sniper_1,R.drawable.sniper_2,R.drawable.sniper_3,"Sniper Elite 4 PC game 2017 Overview\n" +
                "Sniper Elite 4 has been developed and published under the banner of Rebellion. This game was released on 14th February, 2017. You can also download Sniper Elite 3.\n" +
                "Sniper Elite 4 is a game where you are going to experience sniping in most advanced WWII scenario ever build. You can experience tactical 3rd person combat where you are required to set Italy free from the brutal jaws of Fascism. In this game the players are going to be transported to the Italian peninsula. You will be roaming through ancient forests, Mediterranean coastal towns and also need to travel through mountain valleys. The gameplay of Sniper Elite 4 is quite gripping and you have to complete loads of challenging levels and have to compete against hundreds of enemies. There are many different battle scenarios and you need to adopt to these scenarios quickly. Sniper Elite 4 has got staggering visuals and the sounds are impressive too. You can also download Sniper Elite Nazi Zombie Army.","Features of Sniper Elite 4\n" +
                "Following are the main features of Sniper Elite 4 that you will be able to experience after the first install on your Operating System.\n" +
                "Amazing action and adventure game.\n" +
                "Experience sniping in most advanced WWII scenario ever build.\n" +
                "Experience tactical 3rd person combat.\n" +
                "Need to set Italy free from the jaws of Fascism.\n" +
                "Got gripping gameplay.\n" +
                "Got loads of challenging levels.\n" +
                "Need to adjust to many different battle scenarios.\n" +
                "Got staggering visuals.","System Requirements of Sniper Elite 4\n" +
                "Before you start Sniper Elite 4  make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows 7/8/8.1/10\n" +
                "CPU: Intel Core i3 or later.\n" +
                "RAM: 4GB\n" +
                "Setup Size: 48.5 GB\n" +
                "Hard Disk Space: 60 GB");

        db1.insertData_Games("Prototype 2","https://www.youtube.com/watch?v=-X0DfqkXeU8",R.drawable.proto_1,R.drawable.proto_2,R.drawable.proto_3,"Prototype 2 Overview\n" +
                "Welcome to Prototype 2 is the most exciting open world action-adventure video game which has been publish under the banner of Activision. This game was release on 24 April 2012. In this single players you will enjoy fantastic game play with interesting story line. Aegis Defenders is the other game for all game lovers.\n" +
                "In this game you will see new protagonist named as James Heller and the main tasks of Heller to destroy Black light virus. The game has stunning graphic and sound effects quality. The aim of James to destroy the virus due to his family because they are killed by this virus and another protagonist Alex Heller. The best thing about this game is that the James can change the shape of his face and by this opportunity he can sharply take revenge and can complete his mission. To fight against his enemies the James has super human ability and latest power technology which has many benefits for the game players. Players also be able to use powerful weapons to fight against the enemies and some real effects are also added in this game. Anew power Tendril which is responsible to smash objects into another objects and Black Hole power to kill the enemies include. You may also like to download Mercenary Kings Reloaded Edition.","Features Of Prototype 2\n" +
                "Following are the main features of Pro Prototype 2 Download Free that you will be able to experience after the first install on your operating System.\n" +
                "Imposing action and adventure video game.\n" +
                "Main character is James Heller.\n" +
                "Main tasks of James Heller to destroy Black light virus.\n" +
                "Heller can change the shape of his face to defeat against enemies.\n" +
                "New power such as Black Hole and Tendril introduce.","System Requirement Of Prototype 2\n" +
                "Before you start Prototype 2 Download Free make sure your PC meets minimums system requirements.\n" +
                "Operating System: Window XP/ Vista / Window 7/ Window 8 and 8.1\n" +
                "CPU: Core 2 Duo 2.6 GHz\n" +
                "RAM: 2 GB\n" +
                "Setup Size: 8.4GB\n" +
                "Hard Disk Space: 10 GB");


        db1.insertData_Games("The Evil Within","https://www.youtube.com/watch?v=pPNYGpV0XW0",R.drawable.the_evil_within_1,R.drawable.the_evil_within_2,R.drawable.the_evil_within_3,"The Evil Within PC Game Overview\n" +
                "The Evil Within is one of very exciting games. We categorized this game in survival games. It is a game in which you will also enjoy some horror moments. This game is developed by Tango Game works and published by Bethesda Softworks. This game was released on October 14, 2014. Fear Game is also uploaded in our site. Which has same story concept.\n" +
                "The Evil Within is a horror game in which player is battling for his survival. In this game player gets in to the area of enemies and start fighting with them. But at some time the enemy gets bigger on him. The player is still fighting some times he run away from the fighting area but his main aim is to destroy them.","The Evil Within Features\n" +
                "Following are the main features of The Evil Within 2014 PC Game.\n" +
                "Survival game\n" +
                "Horror moments\n" +
                "Battling for survival\n" +
                "Fight with the enemy\n" +
                "Strong enemies\n" +
                "Use of light and heavy weapons\n" +
                "Thrilling missions\n" +
                "Unlock missions","The Evil Within System Requirements\n" +
                "Following are the minimum system requirements of The Evil Within.\n" +
                "Operating System: Windows 7/ Windows 8 and 8.1 ( 64 Bit)\n" +
                "CPU: Core i3  2.4 Ghz\n" +
                "RAM: 4 GB\n" +
                "Hard disk Space: 37 GB");

        db1.insertData_Games("Outlast 2","https://www.youtube.com/watch?v=W73XZ1WHuLQ",R.drawable.out_1,R.drawable.out_2,R.drawable.out_3,"Outlast 2 PC Game 2017 Overview\n" +
                "Outlast 2 is the sequel to the acclaimed survival horror game Outlast. Set in the same universe as the first game, but with different characters and a different setting, Outlast 2 is a twisted new journey into the depths of the human mind and its dark secrets.\n" +
                "Outlast 2 introduces you to Sullivan Knoth and his followers, who left our wicked world behind to give birth to Temple Gate, a town, deep in the wilderness and hidden from civilization. Knoth and his flock are preparing for the tribulations of the end of times and you’re right in the thick of it. You are Blake Langermann, a cameraman working with your wife, Lynn. The two of you are investigative journalists willing to take risks and dig deep to uncover the stories no one else will dare touch.   You’re following a trail of clues that started with the seemingly impossible murder of a pregnant woman known only as Jane Doe.","Features of Outlast 2\n" +
                "Following are the main features of Outlast 2 that you will be able to experience after the first install on your Operating System.\n" +
                "Amazing action, adventure and Indie game.\n" +
                "Got high detailed 3D models and imposing gameplay modes.\n" +
                "Add a standalone entry to your library.\n" +
                "Got high resolution textures.\n" +
                "Got awesome visuals.","System Requirements of Outlast 2\n" +
                "Before you start Outlast 2  make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i3-530\n" +
                "RAM: 4GB\n" +
                "Setup Size: 23.4GB\n" +
                "Hard Disk Space: 30GB");

        db1.insertData_Games("Silent Hill 4","https://www.youtube.com/watch?v=GW_is7yL6_U",R.drawable.silent_hill_1,R.drawable.silent_hill_2,R.drawable.silent_hill_3,"Silent Hill 4 The Room PC Game 2004 Overview\n" +
                "Silent Hill 4 The Room is a survival horror game. It is developed and published under the banner of Konami for Microsoft Windows. It was released on 7th September 2004. It is the fourth installment in the series. You can also download Silent Hill Homecoming.\n" +
                "Silent Hill 4 game is different from the previous installments because it is not set in Silent Hill town. This game depicts a fictional town of South Ashfield. This game revolves around Henry Townshend he has been locked inside his room. He has no communication means and he has the worst nightmares of his life. He gets a hole inside bathroom from where he enters a different dimension and meets different people which are dead in real world. Now Harry has to get rid of all this mess. Slender The Arrival is another horror game that you can download.","Features of Silent Hill 4\n" +
                "Following are the main features of Silent Hill 4 that you will be able to experience after the first install on your Operating System.\n" +
                "Impressive survival horror game.\n" +
                "Different game play than its predecessors.\n" +
                "Need to guide Henry in order to escape from his apartment.\n" +
                "Can discover more locations.\n" +
                "First person perspective in room and third person perspective outside the room.\n" +
                "Player got various melee weapons.\n","System Requirements of Silent Hill 4 PC Game 2004\n" +
                "Before you start Silent Hill 4  make sure your PC meets minimum system requirements.\n" +
                "Operating System: Tested On Windows 7 64 Bit\n" +
                "CPU: 1 GHz Intel processor or faster.\n" +
                "RAM: 256 MB\n" +
                "Hard Disk Space: 3 GB");

        db1.insertData_Games("The Walking Dead A New Frontier Episode 4","https://www.youtube.com/watch?v=O0BqsP96ll4",R.drawable.the_walking_dead_1,R.drawable.the_walking_dead_2,R.drawable.the_walking_dead_3,"The Walking Dead A New Frontier Episode 4 PC Game 2017 Overview\n" +
                "When family is all you have left…how far will you go to protect it? After society was ripped apart by undead hands, pockets of civilization emerge from the chaos. But at what cost? Can the living be trusted on this new frontier?\n" +
                "As Javier, a young man determined to find the family taken from him, you meet a young girl who has experienced her own unimaginable loss. Her name is Clementine, and your fates are bound together in a story where every choice you make could be your last. Includes access to all five episodes (Episode 1-4 available now, Episode 5 coming soon) in this all-new series from the award-winning studio, Telltale Games.","Features of The Walking Dead A New Frontier Episode 4\n" +
                "Following are the main features of The Walking Dead A New Frontier Episode 4 that you will be able to experience after the first install on your Operating System.\n" +
                "Amazing Adventure game.\n" +
                "Enhanced game with new environment and world building details.\n" +
                "Got high detailed 3D models and imposing gameplay modes.\n" +
                "Add a standalone entry to your library.\n" +
                "Got high resolution textures.\n" +
                "Got awesome visuals.","System Requirements of The Walking Dead A New Frontier Episode 4\n" +
                "Before you start The Walking Dead A New Frontier Episode 4  make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core 2 Duo 2.4GHz.\n" +
                "RAM: 3GB\n" +
                "Setup Size: 12.7GB\n" +
                "Hard Disk Space: 14GB");

        db1.insertData_Games("Lethe Episode One","https://www.youtube.com/watch?v=lbMm-KMOhoU",R.drawable.lethe_1,R.drawable.lethe_2,R.drawable.lethe_3,"Lethe Episode One PC Game 2016 Overview\n" +
                "Lethe-Episode One is developed under the banner of KoukouStudios and Faber Interactive. It is released on 1st August 2016 and Faber Interactive published this game.\n" +
                "Lethe Episode One is an interesting adventure game with some horror survival ingredients in it. You are going to explore the frightening world and uncover the dark secrets of your origins. You will see the story of a journalist who has an unremarkable career. His step-father died just recently and now he decided to hunt down his origins. You will see that everything will point towards mining settlement which is mysteriously quiet. When Robert arrive that settlement he is attacked by an unknown substance which provides him psychokinetic powers but it also feeds on its life energy. As he is recovering from this shock there is another attack which poses an even bigger threat. And there starts his battle for survival through all this. This is a stealthy game where you can run or hide to survive. The graphics of this game are richly detailed and colorful. Altogether this game is really enjoyable.","Features of Lethe-Episode One\n" +
                "Following are the main features of Lethe-Episode One  that you will be able to experience after the first install on your Operating System.\n" +
                "Its an amazing stealth adventure game.\n" +
                "It gas an interesting storyline which moves forward as you do.\n" +
                "The graphics are of high quality and you will feel it.\n" +
                "There are a lot of exciting abilities you will have.\n" +
                "It has survival horror elements as well.","System Requirements of Lethe-Episode One PC Game 2016\n" +
                "Before you start Lethe-Episode One   make sure your PC meets minimum system requirements.\n" +
                "Operating System: Tested on Windows 7 64 Bit\n" +
                "CPU: Intel Dual Core 2.0 GHz or faster\n" +
                "RAM: 2 GB\n" +
                "Game Size: 1.4GB\n" +
                "Hard Disk Space: 2 GB of free space required" );

        db1.insertData_Games("Mortal Kompat XL","https://www.youtube.com/watch?v=MHGwhPyxnTI" ,R.drawable.mkxl_1,R.drawable.mkxl_2,R.drawable.mkxl_3,"Mortal Kombat XL PC Game 2016 Overview\n" +
                "Mortal Kombat XL has been developed by NetherRealm Studios and QLOC. This game was released on 4th October, 2016. You can also download Mortal Kombat X.\n" +
                "This update has got bunch of changes and according to the creator of the game Ed Boon the game has become more fun and balanced. The developers NetherRealms has increased energy cost and the in-game items which were formerly only available by playing mobile game now are free to everyone. Mortal Kombat XL has got new playable characters which are Bo’Rai Cho, Triborg, Xenomorph from Alien and Leatherface. It has also got Apocalypse Skin Pack plus has also got content from previous games. With some staggering visuals and smooth actions Mortal Kombat XL is an awesome update which you should definitely try. You can also download Mortal Kombat Komplete Edition.","Features of Mortal Kombat XL\n" +
                "Following are the main features of Mortal Kombat XL that you will be able to experience after the first install on your Operating System.\n" +
                "Awesome action game.\n" +
                "Got bunch of changes in this update.\n" +
                "More fun and more balanced game.\n" +
                "Increased energy cost.\n" +
                "Got new playable characters.\n" +
                "Got staggering visuals.","System Requirements of Mortal Kombat XL\n" +
                "Before you start Mortal Kombat XL  make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i5 or later.\n" +
                "RAM: 3GB\n" +
                "Setup Size: 38.8GB\n" +
                "Hard Disk Space: 40 GB");

        db1.insertData_Games("Guilty Gear Xrd","https://www.youtube.com/watch?v=NKGPhKu3jNg",R.drawable.guilty_gear_1,R.drawable.guilty_gear_2,R.drawable.guilty_gear_3,"Guilty Gear Xrd PC Game 2015 Overview\n" +
                "Guilty Gear Xrd is developed and published under the banner of Arc System Works. It is released on 10th December 2015. You can also download A I Invasion.\n" +
                "Guilty Gear Xrd PC Game has kept its spectacular traditions since 1998 and brought us a new and fresh addition in the series. Every character in the game is redefined and redrawn to give you a fresh breathe of air. The battle system in the game is also modernized and it gives you a futuristic feel. This game has 12 old characters from the previous games including fan favorite Sol and Ky and it added 5 new characters as well.  These 5 new characters include Sin, Bedman, Ramlethal, leo and Elphelt, with them you are going to witness more violent and intense fights. Some of the characters are needed to be unlocked by using the in game money. There are many different modes which you can play in this game. It includes Tutorial Mode, Gallery Mode, M.O.M Mode, and Story Mode. You can also play this exhilarating game online worldwide with other players and show your skill. On the ending note one can say that with these visual qualities and sound effects this game is probably the most exciting game in the series. You may also like to download Devil May Cry 2.","Features of Guilty Gear Xrd\n" +
                "Following are the main features of Guilty Gear Xrd that you will be able to experience after the first install on your Operating System.\n" +
                "Its an excellent action game and a great expansion to the series.\n" +
                "It has kept its traditions with some enhancements.\n" +
                "Every character is redrawn in the 3D.\n" +
                "There are total 17 characters 12 old and 5 brand new.\n" +
                "You can unlock some chacreters by using the in game money.\n" +
                "There are many modes in which you can play.","System Requirements of Guilty Gear Xrd PC Game 2015\n" +
                "Before you start Guilty Gear Xrd  make sure your PC meets minimum system requirements.\n" +
                "Operating System: Tested on Windows 7 64 Bit\n" +
                "CPU: Intel Core i5 or faster\n" +
                "RAM: 2 GB\n" +
                "Hard Disk Space: 12 GB");

        db1.insertData_Games("Tekken 6","https://www.youtube.com/watch?v=wXX2XrILyvY",R.drawable.tekken_1,R.drawable.tekken_2,R.drawable.tekken_3,"\n" +
                "Tekken 6 PC Game Overview\n" +
                "Tekken 6 is a fighting game that has been developed by Namco Bandai. Tekken 6 is the 7th installment of the world acclaimed Tekken series. Tekken series had taken the world by storm since its first release in 1994 since then several installments have been introduced and a few movies have also been made. You can also download Tekken 5 PC Game.\n" +
                "Tekken 6 has lots of improvements compared to its predecessor. There are fairly large areas associated to the fighting stages and now the character customization has also been improved. There has been an inclusion of a new Rage system by which the player will get more injuries. When he/she will be hit when he/she will reach a certain point. Once this system is activated a reddish energy aura will cover up the the character and the energy bar will turn red. Tekken 3 is another game that you can download.","Features of Tekken 6\n" +
                "Following are the main features of Tekken 6 that you will be able to experience after the first install on your Operating System.\n" +
                "Fighting game.\n" +
                "Large stages for fights compared to its predecessor.\n" +
                "Character customization improved.\n" +
                "New Rage system included.\n" +
                "Stunning graphics.\n" +
                "Bound system feature included.","System Requirements of Tekken 6 For Windows PC\n" +
                "Before you start Tekken 6 PC Game  make sure your PC meets minimum system requirements.\n" +
                "Operating System: Windows XP/Vista/ Windows 7 ( 64 Bit )\n" +
                "CPU: Intel Pentium 4 or later.\n" +
                "RAM: 1GB\n" +
                "Hard Disk Space: 1GB");

        db1.insertData_Games("Injustice Gods Among Us","https://www.youtube.com/watch?v=l27-3NJqpiA",R.drawable.injustice_1,R.drawable.injustice_2,R.drawable.injustice_3,"Injustice Gods Among Us PC Game Overview\n" +
                "Injustice: Gods Among Us is a fighting game. This game is based on the characters developed by DC comics and it was developed under the banner of NetherRealm Studios. It was released in April 2013 and was published by Warner Bros. You can also download shank 1.\n" +
                "Injustice Gods Among Us PC game has plot that in another world superman is being drugged by the super villain The Joker and Superman kills his wife and the unborn son. Also Superman attacks Metropolis by a Nuclear Bomb. When he comes to know that it was Joker he kill the Joker. In the real world there is a war between justice league and injustice league. Then the justice league is teleported to that world where superman has now taken the rule. Now you have to play to end the Superman’s Rule. Tekken 6 is another fighting game that you can download.","Features of Injustice Gods among Us PC Game\n" +
                "Following are the main features of Injustice: Gods among us that you will be able to experience after the first install on your Operating System.\n" +
                "Very excellent fighting game.\n" +
                "It has your favorite characters.\n" +
                "Plenty of characters to select.\n" +
                "Graphical details and physical dimensions are very good.\n" +
                "Also with a very amusing story line.","System Requirements of Injustice Gods among Us PC game\n" +
                "Before you start Injustice Gods Among Us  make sure your PC meets minimum system requirements.\n" +
                "Operating System: Windows XP/Vista/7/8\n" +
                "CPU: Intel Core 2 Duo\n" +
                "RAM: 2GB of RAM is required.\n" +
                "Hard Disk Space: 20GB of HDD space is required.");

        db1.insertData_Games("Need For Speed payback","https://www.youtube.com/watch?v=K-5EdHZ0hBs",R.drawable.payback_1,R.drawable.payback_2,R.drawable.payback_3,"Need for Speed™, one of the world’s bestselling video game franchises returns with a vengeance in the new Need for Speed Payback.\n" +
                "Set in the underworld of Fortune Valley, you and your crew were divided by betrayal and reunited by revenge to take down The House, a nefarious cartel that rules the city’s casinos, criminals and cops. In this corrupt gambler’s paradise, the stakes are high and The House always wins.","Features of Need For Speed Payback<--\n" +
                "Following are the main features of Need For Speed Payback Free Download that you will be able to experience after the first install on your Operating System.\n" +
                "Your car is at the center of everything you do in Need for Speed Payback. Endlessly fine-tune your performance with each of the five distinct car classes (Race, Drift, Off-Road, Drag and Runner) to turn the tables on the competition in any race, mission or challenge.\n" +
                "Play as three distinct characters united by one common goal: revenge. Tyler, Mac and Jess team up to even the score against all odds, and enter the ultimate race to take down The House. Battle cops with ever-increasing intensity, race against rivals across the city and drive on and off-road through mountains, canyons and deserts.\n" +
                "Win big with all-new Risk vs Reward gameplay. Intense cop chases mean the stakes have never been higher. Challenge your friends or potential rivals via Autolog recommendations throughout the events or go head-to-head in classic online leaderboards.\n" +
                "Got high resolution textures.\n" +
                "Got awesome visuals.","System Requirements of Need For Speed Payback<--\n" +
                "Before you order Need For Speed Payback make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel i3 6300 @ 3.8GHz or AMD FX 8150 @ 3.6GHz with 4 hardware threads\n" +
                "RAM: 6GB\n" +
                "Setup Size: 27.6GB\n" +
                "Hard Disk Space: 30GB");

        db1.insertData_Games("MX vs ATV All Out","https://www.youtube.com/watch?v=kr5G7of4eLQ",R.drawable.mx_1,R.drawable.mx_2,R.drawable.mx_3,"All Terrain, All Vehicles, All You! MX vs ATV All Out is the complete off-road racing and lifestyle experience!\n" +
                "Choose between bikes, ATVs, UTVs, refine your rider style at your private compound and blast across massive open worlds to compete head to head in various game modes! The all new Freestyle mode allows you to win with style and crazy stunts! Or go All Out and show your riding skills in Multiplayer!","Features of MX vs ATV All Out v1 06\n" +
                "Following are the main features of MX vs ATV All Out v1 06 that you will be able to experience after the first install on your Operating System.\n" +
                "2 player split-screen and 16 player online mode\n" +
                "Compete in various modes like Supercross, Nationals, Opencross, Waypoint, Tag and more\n" +
                "Master insane stunts and test your limits in freestyle mode\n" +
                "Turn your private compound into a show room for the all of your customized vehicles\n" +
                "Upgrade and tune your vehicles with original performance parts\n" +
                "Select your own style from numerous gear companies or choose to compete with one of the many top professional riders from around the world.","System Requirements of MX vs ATV All Out v1 06\n" +
                "Before you start MX vs ATV All Out v1 06 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Quad Core i5 @ 2.5 GHz (or AMD equivalent)\n" +
                "RAM: 8GB\n" +
                "Setup Size: 11.3GB\n" +
                "Hard Disk Space: 26GB");

        db1.insertData_Games("Moto GP 18","https://www.youtube.com/watch?v=kr5G7of4eLQ",R.drawable.moto_1,R.drawable.moto_2,R.drawable.moto_3,"Become the star of the 2018 MotoGP season! Pursue your career as a professional rider starting from the Red Bull MotoGP Rookies Cup up to the Premier class of the MotoGP. Race with all the riders of the MotoGP on 19 official tracks, including the new Buriram International Circuit in Thailand and enjoy an even more immersive experience thanks to new features and a new edition of the MotoGP eSport Championship.\n" +
                "Feel like a professional rider, decide how to change your bike, learn how to manage tyre wear and use the MotoGP ID to monitor your progress. Following your friends’ races has never been so simple thanks to the new cameras that can be set to Spectator Mode.","Features of MotoGP 18\n" +
                "Following are the main features of MotoGP 18 that you will be able to experience after the first install on your Operating System.\n" +
                "Amazing racing, simulation and sports game.\n" +
                "Got high detailed 3D models and imposing gameplay modes.\n" +
                "Add a standalone entry to your library.\n" +
                "Got high resolution textures.\n" +
                "Bundles some of the most staggering modifications.\n" +
                "Got awesome visuals.","System Requirements of MotoGP 18\n" +
                "Before you order MotoGP 18 make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i5-2500, AMD FX-8100 or equivalent\n" +
                "RAM: 8GB\n" +
                "Setup Size: 13GB\n" +
                "Hard Disk Space: 15GB");

        db1.insertData_Games("Forza Horizon 3","https://www.youtube.com/watch?v=RqkpT0qag5c",R.drawable.forzahorizon3_1,R.drawable.forzahorizon3_2,R.drawable.forzahorizon3_3,"THIS IS YOUR HORIZON You’re in charge of the Horizon Festival. Customize everything, hire and fire your friends, and explore Australia in over 350 of the world’s greatest cars.\n" +
                "Make your Horizon the ultimate celebration of cars, music, and freedom of the open road. How you get there is up to you.","Features of Forza Horizon 3<--\n" +
                "Following are the main features of Forza Horizon 3 that you will be able to experience after the first install on your Operating System.\n" +
                "Every car is recreated with ForzaVista™ detail including full cockpit views, working lights and wipers, and new vehicle types bringing all-new driving experiences never before seen in Forza.\n" +
                "Danger Sign Jumps, Convoys, and Drift Zones are just some of the exciting new driving challenges that await you. Star in thrilling Showcase events that pit you and your car against a fleet of speed boats, even a giant airship!\n" +
                "You’re the boss. Hire your friends’ Drivatars to help you gain fans and expand your festival, and form Convoys with them to explore the world even when they’re not online. If they’re not winning you fans, fire them!\n" +
                "Horizon Blueprint gives you the power to modify every aspect of race events, championships, and Bucket List challenges – and instantly challenge friends to beat you at your own game. Choose your driver character, create custom paint jobs and vanity license plates, add new body kits – even select your own car horn sound.\n" +
                "Choose from eight diverse radio stations, or create a custom station from your own music collection with Groove Music.\n" +
                "Got awesome visuals.","System Requirements of Forza Horizon 3<--\n" +
                "Before you order Forza Horizon 3 make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: i3-4170 @ 3.7Ghz\n" +
                "RAM: 8GB\n" +
                "Setup Size: 60.4GB\n" +
                "Hard Disk Space: 70GB");

        db1.insertData_Games("drift tunner 2019","https://www.youtube.com/watch?v=bjiAG-jknPY",R.drawable.drift_1,R.drawable.drift_2,R.drawable.drift_3,"Do you like Drifting? Are you a fan of JDM Style? You dream to fall sideways but you have not picked up a drift car yet? – This game is for you!\n" +
                "In this game, your dream will become a reality! Build a drift car, go to the track, improve your skills and get paid for it! Better skills -> Greater reward -> Better Drift Car!","Features of Drift Tuner 2019 Free Download\n" +
                "Following are the main features of Drift Tuner 2019 Free Download that you will be able to experience after the first install on your Operating System.\n" +
                "Open world city with excellent detail created specially for drift!\n" +
                "Online Mode!\n" +
                "Legendary cars with a lot of available modifications!\n" +
                "Smart and Realistic physics!\n" +
                "Beautifull Realistic graphics!\n" +
                "Large sountrack of licensed music!","System Requirements of Drift Tuner 2019 Free Download\n" +
                "Before you start Drift Tuner 2019 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i3\n" +
                "RAM: 2GB\n" +
                "Setup Size: 1.4GB\n" +
                "Hard Disk Space: 2GB");

        db1.insertData_Games("GTA V","https://www.youtube.com/watch?v=QkkoHAzjnUs",R.drawable.gta_1,R.drawable.gta_2,R.drawable.gta_3,"GTA 5 is developed by Rockstar North and is published under the banner of Rockstar Games. The release date of this game is 14th April 2015. GTA V game can be played either by first person or by third person perspective.\n" +
                "GTA V PC Game Free Download and get ready for action. The story revolves around Michael Townley who is under the witness protection in Las Santos, San Andreas after mismanaged robbery attempt at Ludendorff. Michael discovered that his wife is cheating upon him and has an affair with her tennis coach. Furious to hear about the affair, Michael chased down the coach and destroyed him. All of this happened in a mansion owned by the girlfriend of a drug lord Martin Madrazo. Now Martin demands a heist at a jewelry shop from Michael and from here onwards Michael’s life changed, his family left him and he with his old pals has been left entangled in the criminal underworld. Now the team has to pull off several fatal heists for their survival in the cold-blooded city where nobody is trustworthy. \n" +
                "GTA V has seen a major overhaul in technical and visual aspects. The visuals are more crispy with 4k resolution the player can experience lots of new additions like new weaponry, vehicles and wildlife. The traffic has been made denser. The weather system has been enhanced greatly. GTA V also includes a brand new Rockstar editor. Which will provides a whole bunch of editing tool to the player to create the gameplay clips and publish them on YouTube. Lots of mission and linear scenarios have been included Players can also roam freely here and there in an open world. The world depicted in GTA V is much larger than all the other previous releases and is comprised of countryside San Andreas plus fictional city of Las Santos. Player can run, jump and use vehicles to explore the area. Player can also use melee attacks and different explosive to compete with the enemies. GTA 5 like in all previous GTA releases features multiple radio stations which can be play several genres of music whenever the player enters in a vehicle. You can also opt for GTA Liberty City.","Features of GTA V PC Game\n" +
                "Following are the main features of GTA V PC Game that you will be able to experience after the first install on your Operating System.\n" +
                "Impressive action adventure game.\n" +
                "Major overhauling in technical and visual aspects.\n" +
                "New weaponry, vehicles included.\n" +
                "New wildlife included.\n" +
                "Denser traffic.\n" +
                "Enhanced weather system.\n" +
                "Includes brand new Rockstar editor.\n" +
                "Can use melee attack and other explosives.\n" +
                "Features multiple radio station playing different genres of music.","System Requirements of GTA V PC Game 2015\n" +
                "Before you start GTA V Free Download make sure your PC meets minimum system requirements.\n" +
                "Operating System: Windows 7/ Windows 8 and 8.1 ( 64 Bit )\n" +
                "CPU: Intel Core to Quad 2.4 GHz\n" +
                "RAM: 4 GB\n" +
                "Setup Size: 59 GB\n" +
                "Hard Disk Space: 65 GB");

        db1.insertData_Games("Titan fall 2","https://www.youtube.com/watch?v=N1vqjJRcCzg",R.drawable.titan_1,R.drawable.titan_2,R.drawable.titan_3,"Call down your Titan and get ready for an exhilarating first-person shooter experience in Titanfall™ 2! The sequel introduces a new single player campaign that explores the bond between Pilot and Titan. Or blast your way through an even more innovative and intense multiplayer experience – featuring 6 new Titans, deadly new Pilot abilities, expanded customization, new maps, modes, and much more.\n" +
                "Titanfall™ 2 features a single player campaign packed with action and inventive twists. Play as a Militia rifleman stranded behind enemy lines, who encounters a veteran Vanguard-class Titan. The two must work together to uphold a mission they were never meant to carry out.","Features of Titanfall 2 Game\n" +
                "Following are the main features of Titanfall 2 Game that you will be able to experience after the first install on your Operating System.\n" +
                "As an infantryman trapped behind enemy lines, you must develop your skills under fire to become a full-fledged Pilot, fighting as one with your Titan.\n" +
                "Titanfall 2 features six all-new Titans, a host of deadly new technology, and expanded Pilot abilities. It’s an adrenaline-fueled multiplayer experience that continues the Titanfall legacy of elevating the shooter genre.\n" +
                "Chat with your co-pilots and explore networks by popularity, location and similarity. You can also manage and create new networks.\n" +
                "The apex predator of the Frontier, Pilots are what all riflemen aspire to be – highly skilled, incredibly mobile, and deadly at any range.\n" +
                "Towering over anything that stands in their path, Titans are lethal weapons wrapped in armor and designed to take a punch…or a sword…or a rocket.","System Requirements of Titanfall 2 Game\n" +
                "Before you start Titanfall 2 Game Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Intel Core i3-6300t or equivalent [4 or more hardware threads]\n" +
                "RAM: 8GB\n" +
                "Setup Size: 23.2GB\n" +
                "Hard Disk Space: 30GB");

        db1.insertData_Games("Watch Dogs 2","https://www.youtube.com/watch?v=PnIfMaCMsjU",R.drawable.watch_1,R.drawable.watch_2,R.drawable.watch_3,"Watch Dogs 2 has been developed and published under the banner of Ubisoft. This game was released on 29th November, 2016.\n" +
                "In Watch Dogs 2 you are going to play as Marcus Holloway who is an outstanding hacker living in San Francisco Bay Area. Marcus Holloway needs to team up with a group of ill-famed hackers in order to come up with the biggest hacking in the history. You need to take down ctOS 2.0 which has been developed for monitoring as well as manipulating citizens on a very large scale. In this game you will be exploring the dynamic world with loads of gameplay possibilities. You need to come up with different skills which will suit your playstyle. This game has got a Co-Op as well as adversarial multiplayer mode which will let you connected with your friends.","Features of Watch Dogs 2\n" +
                "Following are the main features of Watch Dogs 2 that you will be able to experience after the first install on your Operating System.\n" +
                "Imposing action and adventure game.\n" +
                "Play as Marcus Holloway who is an outstanding hacker.\n" +
                "Need to take down ctOS 2.0 developed for monitoring citizens.\n" +
                "Supports Co-Op as well as multiplayer mode.\n" +
                "Explore dynamic world with loads of gameplay possibilities.","System Requirements of Watch Dogs 2\n" +
                "Before you start Watch Dogs 2 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows 7/8/8.1/10\n" +
                "CPU: Intel Core i5 or later.\n" +
                "RAM: 6GB\n" +
                "Setup Size: 24.5GB\n" +
                "Hard Disk Space: 50GB");

        db1.insertData_Games("Outbreak The Nightmare Chronicles Chapter 2","https://www.youtube.com/watch?v=N1LaUWdY_oU",R.drawable.out_1,R.drawable.out_2,R.drawable.out_3,"Outbreak The Nightmare Chronicles Chapter 2 Free Download PC Game setup in single direct link for Windows. It is an amazing action, adventure and indie game.\n" +
                "Experience the second chapter in Outbreak: The Nightmare Chronicles. Lydia’s fight for survival in the manor has taken her into the tunnels underneath. What horrors will she discover as she attempts to escape the nightmare?\n" +
                "This DLC includes Chapter Two Story Mode and Battle Mode content. Please do not purchase separately if you’ve purchased the Complete Edition or the Season Pass.","Features of Outbreak The Nightmare Chronicles Chapter 2\n" +
                "Following are the main features of Outbreak The Nightmare Chronicles Chapter 2 that you will be able to experience after the first install on your Operating System.\n" +
                "Got high detailed 3D models and imposing gameplay modes.\n" +
                "Add a standalone entry to your library.\n" +
                "Got high resolution textures.\n" +
                "Bundles some of the most staggering modifications.\n" +
                "Got awesome visuals.","System Requirements of Outbreak The Nightmare Chronicles Chapter 2\n" +
                "Before you start Outbreak The Nightmare Chronicles Chapter 2 Free Download make sure your PC meets minimum system requirements.\n" +
                "Tested on Windows 7 64-Bit\n" +
                "Operating System: Windows Vista/7/8/8.1/10\n" +
                "CPU: Core i3\n" +
                "RAM: 4GB\n" +
                "Setup Size: 2.8GB\n" +
                "Hard Disk Space: 12GB");
    }
}
