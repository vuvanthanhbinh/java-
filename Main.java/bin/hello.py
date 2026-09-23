n = int(input())
arr = list(map(float, input().split()))


min_val = arr[0]
for i in range(1, len(arr)):
    if arr[i] < min_val:
        min_val = arr[i]

comparisons = n - 1

print(f"Giá trị nhỏ nhất: {min_val}")
print(f"Số phép so sánh (trường hợp xấu nhất): {comparisons}")