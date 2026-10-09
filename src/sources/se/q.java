package se;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q EAGER_FLUSHING_EVENT;
    public static final q EVENT_THRESHOLD;
    public static final q EXPLICIT;
    public static final q PERSISTED_EVENTS;
    public static final q SESSION_CHANGE;
    public static final q TIMER;

    static {
        q qVar = new q("EXPLICIT", 0);
        EXPLICIT = qVar;
        q qVar2 = new q("TIMER", 1);
        TIMER = qVar2;
        q qVar3 = new q("SESSION_CHANGE", 2);
        SESSION_CHANGE = qVar3;
        q qVar4 = new q("PERSISTED_EVENTS", 3);
        PERSISTED_EVENTS = qVar4;
        q qVar5 = new q("EVENT_THRESHOLD", 4);
        EVENT_THRESHOLD = qVar5;
        q qVar6 = new q("EAGER_FLUSHING_EVENT", 5);
        EAGER_FLUSHING_EVENT = qVar6;
        $VALUES = new q[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
