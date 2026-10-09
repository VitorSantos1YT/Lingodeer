package n4;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i11) {
        return builder.setContentType(i11);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i11) {
        return builder.setUsage(i11);
    }
}
