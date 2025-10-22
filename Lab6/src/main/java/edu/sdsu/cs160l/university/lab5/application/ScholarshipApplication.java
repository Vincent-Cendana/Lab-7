package edu.sdsu.cs160l.university.lab5.application;

public class ScholarshipApplication implements UniversityApplication {
    @Override
    public void submitScore(Applicant applicant, float score)
    {
        if(score < 3.2){
            applicant.setAdmitted(false);
            throw new UnsupportedOperationException("Cannot admit student to graduate program if his score is below 2.85");
        }
        applicant.setAdmitted(true);
        applicant.setApplicantScore(score);
    }

    @Override
    public void submitDocuments(Applicant applicant, String documents)
    {
        applicant.setApplicantDocuments(documents);
    }

    @Override
    public boolean checkStatus(Applicant applicant) {
        return applicant.isAdmitted() && applicant.getApplicantDocuments() != null;
    }
}
