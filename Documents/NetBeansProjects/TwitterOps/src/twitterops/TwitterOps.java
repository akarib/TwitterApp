/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterops;

import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author BI Developer
 */
public class TwitterOps {

 

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("yjusbLxfxFNG6z5gUYcwF7KLo")
                .setOAuthConsumerSecret("lLaAc4RAKDAekUxNwftHydpowU121lKqiRFAFR776LdrvYZkgS")
                .setOAuthAccessToken("254759233-dSYALwf8rTaB16p8rvvIe3XtnZL1QyqH2I63VhDF")
                .setOAuthAccessTokenSecret("Rw8PkNgLQ93Skug6txU5d6CG40qspjkvvuE0ewnT4c4WC");
        
        TwitterFactory tf=new TwitterFactory(cb.build());
        
        twitter4j.Twitter tw=tf.getInstance();
        
        
        String stringCre = "@Cryptopia_NZ";
        
        User Usr2 = tw.createFriendship(stringCre);
        
        // post //
        
       Status stat = tw.updateStatus("Good morning");
        
       System.out.println("Twitter Updates");
         
         //Reading timeline//
         
         List<Status> statuses=  tw.getHomeTimeline();
         
           for (Status status1 : statuses) {
            System.out.println(status1.getUser().getName() + ":" + status1.getText());
         
         
             }
    
      }
};
    
