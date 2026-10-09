package com.google.common.base;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Splitter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharMatcher f16384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Strategy f16386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16387d;

    /* JADX INFO: renamed from: com.google.common.base.Splitter$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements Strategy {
        @Override // com.google.common.base.Splitter.Strategy
        public final Iterator a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int c(int i11) {
                    AnonymousClass4.this.getClass();
                    if (i11 < this.f16393c.length()) {
                        return i11;
                    }
                    return -1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int b(int i11) {
                    return i11;
                }
            };
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MapSplitter {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class SplittingIterator extends AbstractIterator<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f16393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharMatcher f16394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f16395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16396f = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16397t;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.f16394d = splitter.f16384a;
            this.f16395e = splitter.f16385b;
            this.f16397t = splitter.f16387d;
            this.f16393c = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        public final Object a() {
            CharMatcher charMatcher;
            int i11 = this.f16396f;
            while (true) {
                int i12 = this.f16396f;
                if (i12 == -1) {
                    this.f16328a = AbstractIterator.State.DONE;
                    return null;
                }
                int iC = c(i12);
                CharSequence charSequence = this.f16393c;
                if (iC == -1) {
                    iC = charSequence.length();
                    this.f16396f = -1;
                } else {
                    this.f16396f = b(iC);
                }
                int i13 = this.f16396f;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f16396f = i14;
                    if (i14 > charSequence.length()) {
                        this.f16396f = -1;
                    }
                } else {
                    while (true) {
                        charMatcher = this.f16394d;
                        if (i11 >= iC || !charMatcher.m(charSequence.charAt(i11))) {
                            break;
                        }
                        i11++;
                    }
                    while (iC > i11 && charMatcher.m(charSequence.charAt(iC - 1))) {
                        iC--;
                    }
                    if (!this.f16395e || i11 != iC) {
                        int i15 = this.f16397t;
                        if (i15 == 1) {
                            iC = charSequence.length();
                            this.f16396f = -1;
                            while (iC > i11 && charMatcher.m(charSequence.charAt(iC - 1))) {
                                iC--;
                            }
                        } else {
                            this.f16397t = i15 - 1;
                        }
                        return charSequence.subSequence(i11, iC).toString();
                    }
                    i11 = this.f16396f;
                }
            }
        }

        public abstract int b(int i11);

        public abstract int c(int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Strategy {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(Strategy strategy, boolean z11, CharMatcher charMatcher, int i11) {
        this.f16386c = strategy;
        this.f16385b = z11;
        this.f16384a = charMatcher;
        this.f16387d = i11;
    }

    public static Splitter a(char c11) {
        final CharMatcher.Is is = new CharMatcher.Is(c11);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public final Iterator a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int b(int i11) {
                        return i11 + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int c(int i11) {
                        return is.i(this.f16393c, i11);
                    }
                };
            }
        });
    }

    public static Splitter b(final String str) {
        Preconditions.e("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? a(str.charAt(0)) : new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            public final Iterator a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int b(int i11) {
                        return str.length() + i11;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int c(int i11) {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        int length = str.length();
                        CharSequence charSequence2 = this.f16393c;
                        int length2 = charSequence2.length() - length;
                        while (i11 <= length2) {
                            for (int i12 = 0; i12 < length; i12++) {
                                if (charSequence2.charAt(i12 + i11) != str.charAt(i12)) {
                                    i11++;
                                }
                            }
                            return i11;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public static void c() {
        Platform.f16375a.getClass();
        final JdkPattern jdkPattern = new JdkPattern(Pattern.compile("\r\n|\n|\r"));
        Preconditions.f("The pattern may not match the empty string: %s", !jdkPattern.a(BuildConfig.VERSION_NAME).f16364a.matches(), jdkPattern);
        new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.Strategy
            public final Iterator a(Splitter splitter, CharSequence charSequence) {
                final JdkPattern.JdkMatcher jdkMatcherA = jdkPattern.a(charSequence);
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.3.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int b(int i11) {
                        return jdkMatcherA.a();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int c(int i11) {
                        CommonMatcher commonMatcher = jdkMatcherA;
                        if (commonMatcher.b(i11)) {
                            return commonMatcher.c();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public final Iterable d(final String str) {
        str.getClass();
        return new Iterable<String>(this) { // from class: com.google.common.base.Splitter.5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Splitter f16392b;

            {
                this.f16392b = this;
            }

            @Override // java.lang.Iterable
            public final Iterator<String> iterator() {
                CharSequence charSequence = str;
                Splitter splitter = this.f16392b;
                return splitter.f16386c.a(splitter, charSequence);
            }

            public final String toString() {
                Joiner joiner = new Joiner(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                joiner.b(sb2, iterator());
                sb2.append(']');
                return sb2.toString();
            }
        };
    }

    public final List e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itA = this.f16386c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add((String) itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void f() {
        CharMatcher.Whitespace.f16351c.getClass();
    }

    public Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.None.f16344b, Integer.MAX_VALUE);
    }
}
