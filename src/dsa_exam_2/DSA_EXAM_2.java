/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_exam_2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Chamara
 */
public class DSA_EXAM_2 {

    public static void main(String[] args) {
        Queue<Candidate> queue = new LinkedList<>();

        // Add the candidates and their vote counts
       
        queue.add(new Candidate("Vidura Wickramanayake", 899990, "Kalutara district"));
        queue.add(new Candidate("Yasapala Korala", 855622, "Kalutara district"));
        queue.add(new Candidate("Prasanna Ranatunga", 765222, "Colombo district"));
        queue.add(new Candidate("Reginald Kure", 489258, "Colombo district"));
        queue.add(new Candidate("Isura Devapriya", 369784, "Gampaha district"));

        // Only add candidates with more than 5 lakh votes to the queue
        while (!queue.isEmpty()) {
            Candidate candidate = queue.remove();
            if (candidate.getVotes() > 500000) {
                System.out.println(candidate.getName() + " has won from " + candidate.getDistrict() + " with " + candidate.getVotes() + " votes.");
            }
        }
    }
}

class Candidate {
    private String name;
    private int votes;
    private String district;

    public Candidate(String name, int votes, String district) {
        this.name = name;
        this.votes = votes;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public String getDistrict() {
        return district;
    }
}
