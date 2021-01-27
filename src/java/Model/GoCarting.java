/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Raaid
 */
public class GoCarting extends VacationDecorator{

    public GoCarting(Vacation vacation) {
        super(vacation);
    }

    @Override
    public int getCost() {
        int total = vacation.getCost()+ 75;
        return total;
    }
    
}
