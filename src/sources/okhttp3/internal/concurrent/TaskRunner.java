package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import k00.a;
import kotlin.jvm.internal.m;
import nv.p;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class TaskRunner implements Lockable {
    public static final Logger M;
    public static final TaskRunner N;
    public final ArrayList H;
    public final ArrayList K;
    public final TaskRunner$runnable$1 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealBackend f45227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f45228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45232f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45233t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Backend {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f45234a;

        public RealBackend(a aVar) {
            this.f45234a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }
    }

    static {
        new Companion(0);
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        m.e(logger, "getLogger(...)");
        M = logger;
        String name = _UtilJvmKt.f45205b + " TaskRunner";
        m.f(name, "name");
        N = new TaskRunner(new RealBackend(new a(name, true)));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        Logger logger = M;
        m.f(logger, "logger");
        this.f45227a = realBackend;
        this.f45228b = logger;
        this.f45229c = 10000;
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task taskB;
                long jNanoTime;
                Task taskB2;
                TaskRunner taskRunner = this.f45235a;
                synchronized (taskRunner) {
                    taskRunner.f45233t++;
                    taskB = taskRunner.b();
                }
                if (taskB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                while (true) {
                    try {
                        threadCurrentThread.setName(taskB.f45214a);
                        Logger logger2 = this.f45235a.f45228b;
                        TaskQueue taskQueue = taskB.f45216c;
                        m.c(taskQueue);
                        boolean zIsLoggable = logger2.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            TaskLoggerKt.a(logger2, taskB, taskQueue, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = taskB.a();
                            if (zIsLoggable) {
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "finished run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            TaskRunner taskRunner2 = this.f45235a;
                            synchronized (taskRunner2) {
                                TaskRunner.a(taskRunner2, taskB, jA, true);
                                taskB2 = taskRunner2.b();
                            }
                            if (taskB2 == null) {
                                threadCurrentThread.setName(name);
                                return;
                            }
                            taskB = taskB2;
                        } catch (Throwable th2) {
                            if (zIsLoggable) {
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "failed a run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            TaskRunner taskRunner3 = this.f45235a;
                            synchronized (taskRunner3) {
                                TaskRunner.a(taskRunner3, taskB, -1L, false);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            threadCurrentThread.setName(name);
                            throw th4;
                        }
                    }
                }
            }
        };
    }

    public static final void a(TaskRunner taskRunner, Task task, long j11, boolean z11) {
        TimeZone timeZone = _UtilJvmKt.f45204a;
        TaskQueue taskQueue = task.f45216c;
        m.c(taskQueue);
        if (taskQueue.f45221d != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z12 = taskQueue.f45223f;
        taskQueue.f45223f = false;
        taskQueue.f45221d = null;
        taskRunner.H.remove(taskQueue);
        if (j11 != -1 && !z12 && !taskQueue.f45220c) {
            taskQueue.e(task, j11, true);
        }
        if (taskQueue.f45222e.isEmpty()) {
            return;
        }
        taskRunner.K.add(taskQueue);
        if (z11) {
            return;
        }
        taskRunner.e();
    }

    public final Task b() {
        long j11;
        Task task;
        boolean z11;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        while (true) {
            ArrayList arrayList = this.K;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i11 = 0;
            Task task2 = null;
            while (true) {
                if (i11 >= size) {
                    j11 = jNanoTime;
                    task = null;
                    z11 = false;
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                Task task3 = (Task) ((TaskQueue) obj).f45222e.get(0);
                j11 = jNanoTime;
                task = null;
                long jMax = Math.max(0L, task3.f45217d - j11);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z11 = true;
                        break;
                    }
                    task2 = task3;
                }
                jNanoTime = j11;
            }
            ArrayList arrayList2 = this.H;
            if (task2 != null) {
                TimeZone timeZone2 = _UtilJvmKt.f45204a;
                task2.f45217d = -1L;
                TaskQueue taskQueue = task2.f45216c;
                m.c(taskQueue);
                taskQueue.f45222e.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.f45221d = task2;
                arrayList2.add(taskQueue);
                if (z11 || (!this.f45230d && !arrayList.isEmpty())) {
                    e();
                }
                return task2;
            }
            if (this.f45230d) {
                if (jMin >= this.f45231e - j11) {
                    return task;
                }
                notify();
                return task;
            }
            this.f45230d = true;
            this.f45231e = j11 + jMin;
            try {
                try {
                    TimeZone timeZone3 = _UtilJvmKt.f45204a;
                    if (jMin > 0) {
                        long j12 = jMin / 1000000;
                        long j13 = jMin - (1000000 * j12);
                        if (j12 > 0 || jMin > 0) {
                            wait(j12, (int) j13);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = _UtilJvmKt.f45204a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((TaskQueue) arrayList2.get(size2)).a();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size3);
                        taskQueue2.a();
                        if (taskQueue2.f45222e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.f45230d = false;
            } catch (Throwable th2) {
                this.f45230d = false;
                throw th2;
            }
        }
    }

    public final void c(TaskQueue taskQueue) {
        m.f(taskQueue, "taskQueue");
        TimeZone timeZone = _UtilJvmKt.f45204a;
        if (taskQueue.f45221d == null) {
            boolean zIsEmpty = taskQueue.f45222e.isEmpty();
            ArrayList arrayList = this.K;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = _UtilCommonKt.f45202a;
                m.f(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f45230d) {
            notify();
        } else {
            e();
        }
    }

    public final TaskQueue d() {
        int i11;
        synchronized (this) {
            i11 = this.f45229c;
            this.f45229c = i11 + 1;
        }
        return new TaskQueue(this, p.j(i11, "Q"));
    }

    public final void e() {
        TimeZone timeZone = _UtilJvmKt.f45204a;
        int i11 = this.f45232f;
        if (i11 > this.f45233t) {
            return;
        }
        this.f45232f = i11 + 1;
        TaskRunner$runnable$1 runnable = this.L;
        m.f(runnable, "runnable");
        this.f45227a.f45234a.execute(runnable);
    }
}
