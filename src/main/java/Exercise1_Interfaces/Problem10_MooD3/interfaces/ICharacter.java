package Exercise1_Interfaces.Problem10_MooD3.interfaces;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public interface ICharacter<H, S> {

    String getName();

    H getHashedPassword();

    void setHashedPassword(H hashedPassword);

    int getLevel();

    S getSpecialPoints();

}
