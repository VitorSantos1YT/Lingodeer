package okhttp3.internal.concurrent;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import ep.a;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class TaskQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskRunner f45218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Task f45221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45223f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AwaitIdleTask extends Task {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CountDownLatch f45224e;

        public AwaitIdleTask() {
            super(a.k(new StringBuilder(), _UtilJvmKt.f45205b, " awaitIdle"), false);
            this.f45224e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            this.f45224e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        m.f(name, "name");
        this.f45218a = taskRunner;
        this.f45219b = name;
        this.f45222e = new ArrayList();
    }

    public static void b(TaskQueue taskQueue, final String name, final fz.a block, int i11) {
        final boolean z11 = (i11 & 4) != 0;
        taskQueue.getClass();
        m.f(name, "name");
        m.f(block, "block");
        taskQueue.c(new Task(name, z11) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                block.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final boolean a() {
        Task task = this.f45221d;
        if (task != null && task.f45215b) {
            this.f45223f = true;
        }
        ArrayList arrayList = this.f45222e;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).f45215b) {
                Logger logger = this.f45218a.f45228b;
                Task task2 = (Task) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task2, this, "canceled");
                }
                arrayList.remove(size);
                z11 = true;
            }
        }
        return z11;
    }

    public final void c(Task task, long j11) {
        m.f(task, "task");
        synchronized (this.f45218a) {
            if (!this.f45220c) {
                if (e(task, j11, false)) {
                    this.f45218a.c(this);
                }
            } else if (task.f45215b) {
                Logger logger = this.f45218a.f45228b;
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f45218a.f45228b;
                if (logger2.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void f() {
        TaskRunner taskRunner = this.f45218a;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        synchronized (taskRunner) {
            this.f45220c = true;
            if (a()) {
                this.f45218a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f45219b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[LOOP:0: B:23:0x0066->B:27:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007c A[EDGE_INSN: B:39:0x007c->B:29:0x007c BREAK  A[LOOP:0: B:23:0x0066->B:27:0x0078], SYNTHETIC] */
    public final boolean e(Task task, long j11, boolean z11) {
        int size;
        int size2;
        int i11;
        Object obj;
        String strConcat;
        Logger logger = this.f45218a.f45228b;
        m.f(task, "task");
        TaskQueue taskQueue = task.f45216c;
        if (taskQueue != this) {
            if (taskQueue != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f45216c = this;
        }
        long jNanoTime = System.nanoTime();
        long j12 = jNanoTime + j11;
        ArrayList arrayList = this.f45222e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f45217d = j12;
            if (logger.isLoggable(Level.FINE)) {
                if (z11) {
                    strConcat = "run again after ".concat(TaskLoggerKt.b(j12 - jNanoTime));
                } else {
                    strConcat = MzwEyWCkjXL.SsNmpUXnDusUq.concat(TaskLoggerKt.b(j12 - jNanoTime));
                }
                TaskLoggerKt.a(logger, task, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i11 = 0;
            while (true) {
                if (i11 < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i11);
                i11++;
                if (((Task) obj).f45217d - jNanoTime > j11) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, task);
            if (size2 == 0) {
                return true;
            }
        } else if (task.f45217d > j12) {
            arrayList.remove(iIndexOf);
            task.f45217d = j12;
            if (logger.isLoggable(Level.FINE)) {
                if (z11) {
                    strConcat = "run again after ".concat(TaskLoggerKt.b(j12 - jNanoTime));
                } else {
                    strConcat = MzwEyWCkjXL.SsNmpUXnDusUq.concat(TaskLoggerKt.b(j12 - jNanoTime));
                }
                TaskLoggerKt.a(logger, task, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i11 = 0;
            while (true) {
                if (i11 < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i11);
                i11++;
                if (((Task) obj).f45217d - jNanoTime > j11) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, task);
            if (size2 == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            TaskLoggerKt.a(logger, task, this, "already scheduled");
            return false;
        }
        return false;
    }
}
