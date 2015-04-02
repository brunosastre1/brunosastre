/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.fci.ticketmachine.core;

public class PapelMoeda {

	protected int valor;
	protected int quantidade;

	public PapelMoeda(int valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public int getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}
}