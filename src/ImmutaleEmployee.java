package src;

import java.util.*;
import java.util.stream.Collectors;

public final class ImmutaleEmployee
{
    private final String name;
    private final Date doj;
    private final List<String> mob;

    public ImmutaleEmployee(String name, Date doj, List<String> mob) {
        this.name = name;
        this.doj = (Date) doj.clone();
        this.mob = new ArrayList<>(mob);
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return (Date) doj.clone();
    }

    public List<String> getMob() {
        return new ArrayList<>(mob);
    }

    @Override
    public String toString() {
        return "ImmutaleEmployee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mob=" + mob +
                '}';
    }

    public static void main(String[] args) {
        Date date= new Date();
        ImmutaleEmployee em= new ImmutaleEmployee("Sam",date,
                Arrays.stream(new String[]{"1234","9874"})
                .collect(Collectors.toList()));

        em.getDoj().setDate(19);

        em.getMob().add("998989");

        System.out.println(em);
    }
}
