package com.hydrozoa.pokemon.model;

import com.hydrozoa.pokemon.model.actor.Actor;
import com.hydrozoa.pokemon.model.actor.PlayerActor;
import com.hydrozoa.pokemon.worldloader.LTerrain;

import java.util.Random;

/**
 * @author hydrozoa
 */
public class WildGrassTile extends Tile {
	private final float encounter;
	private final Random rng;

	public WildGrassTile(LTerrain terrain, float encounter) {
		super(terrain);
		this.encounter = encounter;
		this.rng = new Random();
	}
	
	@Override
	public void actorStep(Actor a) {
		if (a instanceof PlayerActor) {
			if (rng.nextFloat() < encounter) {
				// Trigger wild battle
				//((PlayerActor)a).triggerWildBattle();
				System.out.println("Ada pokemon listrik");
				//((PlayerActor) a)
			}
		}
	}

}
