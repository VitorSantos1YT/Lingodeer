package okhttp3.internal.concurrent;

import defpackage.e;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class TaskLoggerKt {
    public static final void a(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.f45219b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f45214a);
    }

    public static final String b(long j11) {
        String strI;
        if (j11 <= -999500000) {
            strI = e.i((j11 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j11 <= -999500) {
            strI = e.i((j11 - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j11 <= 0) {
            strI = e.i((j11 - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j11 < 999500) {
            strI = e.i((j11 + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j11 < 999500000) {
            strI = e.i((j11 + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strI = e.i((j11 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strI}, 1));
    }
}
