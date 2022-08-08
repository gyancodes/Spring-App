package annotationTut;

import org.springframework.stereotype.Component;

@Component("dietCoach")
public class dietCoach implements Coach {


    @Override
    public String getDiet() {
        return "Protein is very important for muscle building";
    }
}
