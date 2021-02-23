array = {1,2,0,0,3,1,2} -- arrays start at 1

function swap(a, b, table)

    if table[a] == nil or table[b] == nil then
        return false
    end

    if table[a] > table[b] then
        table[a], table[b] = table[b], table[a]
        return true
    end

    return false

end


function bubblesort(array)
    
    local j
    
    for i=1,#array do

        j = i

        while (swap(j, j+1, array)) do
            j = j - 1
        end
		
    end
	return array
end

for k, v in pairs(array) do
    print(k, " ", v)
end

print (" ")

array = bubblesort(array)

for k, v in pairs(array) do
    print(k, " ", v)
end