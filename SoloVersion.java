
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javax.swing.*;
import java.io.IOException;
import java.text.Normalizer;
import java.time.Duration;

public class SoloVersion extends GameVersion {

	public SoloVersion(int length, int width, int nbFloors,int nbObstacles,int nbMonstres,int nbTeleport,int nbDoors,int nbBonus,int typeBonus,String name, Scores score) throws FormatNotSupported, IOException {
		super(length, width,nbFloors,nbObstacles,nbMonstres,nbTeleport,nbDoors,nbBonus,typeBonus, name, score);

	}

	public SoloVersion(MazeFloors maze, Player player, Scores scores) throws FormatNotSupported, IOException {
		super(maze, player, scores);

	}

	public SoloVersion(MazeFloors maze, String name, Scores scores) throws FormatNotSupported, IOException {
		super(maze, name, scores);

	}

	public SoloVersion(MazeFloors maze, Player player) throws FormatNotSupported, IOException {
		this(maze, player, new Scores("txt/bestSolos.txt",MazeInterface.getDifficulty(maze.getFloor().getFirst().getHeight(),maze.getFloor().getFirst().getWidth())));

	}

	public SoloVersion(MazeFloors maze, String name) throws FormatNotSupported, IOException {
		this(maze, name, new Scores("txt/bestSolos.txt",MazeInterface.getDifficulty(maze.getFloor().getFirst().getHeight(),maze.getFloor().getFirst().getWidth())));
	}

	@Override
	public String scoresFile() {
		return "txt/bestSolos.txt";
	}

}