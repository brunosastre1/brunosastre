/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.fci.ticketmachine.core;

import br.mackenzie.fci.ticketmachine.exception.PapelMoedaInvalidaException;
import br.mackenzie.fci.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 1146132
 */
public class TicketMachineTest {

    @Test
    public void test() throws SaldoInsuficienteException,
            PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(2);
        Assert.assertEquals(0, tm.getSaldo());
        tm.inserir(10);
        tm.inserir(20);
        tm.inserir(100);
        Assert.assertEquals(130, tm.getSaldo());
        String aux = tm.imprimir();
        Assert.assertEquals(
                "*****************\n*** R$ 128,00 ****\n*****************\n",
                aux);

        PapelMoeda pm;
        Iterator<PapelMoeda> itTroco;
        itTroco = tm.getTroco();
        while (itTroco.hasNext()) {
            pm = itTroco.next();
            System.out.print(pm.getQuantidade() + " ");
            System.out.println(pm.getValor());
        }

    }
}