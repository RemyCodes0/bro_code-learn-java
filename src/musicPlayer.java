// import java.io.File;
// import java.io.IOException;
// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.UnsupportedAudioFileException;

// public class musicPlayer {

//     String filePath = "memphis-trap-wav-349366.wav";
//     File file = new File(filePath);

  
//         try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)){
//             Clip clip = AudioSystem.getClip();
//             System.out.println("Audio loaded successfully!");
//         }catch(LineUnavailableException e){
//             System.out.println("Unable to access audio ressource");
//         } catch (UnsupportedAudioFileException e) {
//             System.out.println("Audio file is not supported");
//         } catch (IOException e) {
//             System.out.println("Something went wrong");
//         }
    
// }
