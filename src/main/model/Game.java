package model;

import java.util.ArrayList;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 *         un jeu qui peut evoluer (avant de se terminer) sur un plateau width x
 *         height
 */
public interface Game {

	/**
	 * methode qui contient l'evolution du jeu en fonction de la commande
	 *
	 * @param userCmd
	 *            commande utilisateur
	 */
	public void evolve(Cmd userCmd);

	/**
	 * @return true si et seulement si le jeu est fini
	 */
	public boolean isFinished();

	/**
	* @param x
	* @param y
	* @return true si la position correspond à la sortie
	*/
	public boolean isTreasure(int x, int y);

	/**
	* @return le trésor
	*/
	public Treasure getTreasure();

	/**
	* @param x
	* @param y
	* @return true si la position correspond à celle d'un monstre
	*/
	public boolean isMonster(int x, int y);

	/**
	 * @return hero de la partie
	 */
	public Hero getHero();

	/**
	 * @param hero
	 */
	public void setHero(Hero hero);

	/**
	* @return largeur du labyrinthe
	*/
	public int getWidth();

	/**
	*
	* @return hauteur du labyrinthe
	*/
	public int getHeight();

	/**
	* @param x
	* @param y
	* @return true si il y a un mur à la position (x,y)
	*/
	public boolean isWall(int x, int y);

	/**
	* @param x
	* @param y
	* @return true si il y a un piege à la position (x,y)
	*/
	public boolean isTrap(int x, int y);

	/**
	* @param x
	* @param y
	* @return true si il y a un teleporteur à la position (x,y)
	*/
	public boolean isTeleporter(int x, int y);

	/**
	* @param x
	* @param y
	* @return teleporteur à la position (x,y)
	*/
	public Teleporter getTeleporter(int x, int y);

	/**
	* @return liste de monstres de la partie
	*/
	public ArrayList<Monster> getMonsters();

}
