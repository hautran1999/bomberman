package uet.oop.bomberman;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.*;

public class GameSound {
	public static void playGame() throws FileNotFoundException, IOException
	{
		InputStream music = new FileInputStream(new File("D:\\bomberman-starter-starter-project-1\\res\\sound\\playgame.wav"));
		AudioStream audios = new AudioStream(music);
		AudioPlayer.player.start(audios);
	}
	public static void bombBang() throws FileNotFoundException, IOException
	{
		InputStream music = new FileInputStream(new File("D:\\bomberman-starter-starter-project-1\\res\\sound\\bomb_bang.wav"));
		AudioStream audios = new AudioStream(music);
		AudioPlayer.player.start(audios);
	}
	public static void newBomb() throws FileNotFoundException, IOException
	{
		InputStream music = new FileInputStream(new File("D:\\bomberman-starter-starter-project-1\\res\\sound\\newbomb.wav"));
		AudioStream audios = new AudioStream(music);
		AudioPlayer.player.start(audios);
	}
	public static void monsterDie() throws FileNotFoundException, IOException
	{
		InputStream music = new FileInputStream(new File("D:\\bomberman-starter-starter-project-1\\res\\sound\\monster_die.wav"));
		AudioStream audios = new AudioStream(music);
		AudioPlayer.player.start(audios);
	}
	public static void bomberDie() throws FileNotFoundException, IOException
	{
		InputStream music = new FileInputStream(new File("D:\\bomberman-starter-starter-project-1\\res\\sound\\bomber_die.wav"));
		AudioStream audios = new AudioStream(music);
		AudioPlayer.player.start(audios);
	}
}