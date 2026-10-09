package com.github.javiersantos.piracychecker.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Display {
    private static final /* synthetic */ Display[] $VALUES;
    public static final Display ACTIVITY;
    public static final Display DIALOG;

    static {
        Display display = new Display("DIALOG", 0);
        DIALOG = display;
        Display display2 = new Display("ACTIVITY", 1);
        ACTIVITY = display2;
        $VALUES = new Display[]{display, display2};
    }

    public static Display valueOf(String str) {
        return (Display) Enum.valueOf(Display.class, str);
    }

    public static Display[] values() {
        return (Display[]) $VALUES.clone();
    }
}
