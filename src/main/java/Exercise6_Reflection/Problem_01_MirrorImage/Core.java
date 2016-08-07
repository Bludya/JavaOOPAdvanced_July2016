package Exercise6_Reflection.Problem_01_MirrorImage;

import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.*;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.Runnable;
import Exercise6_Reflection.Problem_01_MirrorImage.models.IdProviderImpl;
import Exercise6_Reflection.Problem_01_MirrorImage.models.Wizard;
import Exercise6_Reflection.Problem_01_MirrorImage.repositories.MagicianRepository;

import java.io.IOException;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Core implements Runnable {
    private InputReader reader;
    private OutputWriter writer;
    private Repository repository;

    public Core(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        this.repository = new MagicianRepository();
    }

    @Override
    public void start() throws IOException {

        Magician magician = this.startMagician();

        while (true) {
            String[] input = reader.readLine().split("\\s+");

            if (input[0].equals("END")) {
                break;
            }

            String magic = input[1];
            int id = Integer.parseInt(input[0]);
            repository.getMagician(id).castMagic(magic);
        }
    }

    private Magician startMagician() throws IOException {
        String[] input = this.reader.readLine().split("\\s+");
        String name = input[0];
        int magicPower = Integer.parseInt(input[1]);

        IdProvider idProvider = new IdProviderImpl();

        return new Wizard(
                name,
                magicPower,
                idProvider,
                this.repository,
                this.writer
        );
    }
}
