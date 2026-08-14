package com.badlogic.gdx.tests.utils;

import com.badlogic.gdx.Gdx;

public class GLTestUtils {

    public static boolean isAngleGLES30() {
        return Gdx.graphics.isGL30Available() &&
                Gdx.gl30.getClass().getName().equals("com.badlogic.gdx.backends.lwjgl3.angle.Lwjgl3GLES30");
    }
}
