#include <cstdio>

int n, m;
int card[100];
int sum;
int max = 0; // 카드 합 중 최댓값이 답

int main() {
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; i++){
        scanf("%d", &card[i]);
    }

    // 3개의 합 -> 경우의 수 10
    for (int i = 0; i < n - 2; i++) {
        for(int j = i + 1; j < n - 1; j++) {
            for(int k = j + 1; k < n; k++) {
                sum = card[i] + card[j] + card[k];

                if(sum <= m && max < sum){
                    max = sum;
                }
            }
        }
    }
    printf("%d\n", max);
}