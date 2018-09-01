package com.gamingmesh.jobs.api;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.gamingmesh.jobs.container.Job;

public final class JobsExpGainEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private OfflinePlayer offlinePlayer;
    private double exp;
    private Job job;
    private boolean cancelled = false;

    public JobsExpGainEvent(OfflinePlayer offlinePlayer, Job job, double exp) {
	this.offlinePlayer = offlinePlayer;
	this.job = job;
	this.exp = exp;
    }

    public OfflinePlayer getPlayer() {
	return offlinePlayer;
    }

    public Job getJob() {
	return job;
    }

    public double getExp() {
	return exp;
    }

    public void setExp(double exp) {
	this.exp = exp;
    }

    @Override
    public boolean isCancelled() {
	return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
	this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
	return handlers;
    }

    public static HandlerList getHandlerList() {
	return handlers;
    }
}