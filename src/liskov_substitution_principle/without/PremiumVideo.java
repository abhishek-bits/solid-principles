package liskov_substitution_principle.without;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class PremiumVideo extends Video {

    private int premiumId;

    // Premium videos are the ones which do not have ads.
    // This is a very bad idea.
    @Override
    public void playRandomAd() throws Exception {
        throw new Exception("No Ads play during Premium Videos");
    }
}
